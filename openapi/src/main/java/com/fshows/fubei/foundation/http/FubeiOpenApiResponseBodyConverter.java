package com.fshows.fubei.foundation.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.fshows.fubei.foundation.constants.BizKeyConstants;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.exception.SdkBizException;
import com.fshows.fubei.foundation.model.CommonResultModel;
import com.fshows.fubei.foundation.support.FastJsonConfig;
import com.google.common.base.Strings;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.MessageFormat;

/**
 * 付呗开放平台 接口Response转换
 *
 * @author John (linwei@fshows.com)
 * @version $Id FubeiOpenApiResponseBodyConverter.java, v1.0 2019-06-06 23:14 John Exp$
 */
@SuppressWarnings("unused")
public class FubeiOpenApiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private ParserConfig parserConfig = FastJsonConfig.DEFAULT_PARSER_CONFIG;
    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;
    private Feature[] features;

    /**
     * 数据类型
     */
    private Type type;

    FubeiOpenApiResponseBodyConverter(Type type) {
        this.type = type;
    }

    /**
     * 将responseBody转为T
     *
     * @param value responseBody
     * @return 实体对象
     */
    @Nullable
    @Override
    public T convert(@Nonnull ResponseBody value) throws IOException {
        try {
            // 获得响应Body
            String body = value.string();
            CommonResultModel commonResultModel = new CommonResultModel();
            JSONObject jsonObject = JSON.parseObject(body);
            if (jsonObject == null) {
                throw new SdkBizException(-9999, MessageFormat.format("服务器数据返回异常，解析失败。返回内容：{0}", Strings.isNullOrEmpty(body) ? "(空数据)" : body));
            }
            // 获得结果代码
            int resultCode = jsonObject.getIntValue(BizKeyConstants.RESULT_CODE);
            commonResultModel.setResultCode(resultCode);
            // 返回结果代码200：成功
            if (resultCode == OpenApiConstants.RESULT_CODE_SUCCESS) {
                String dataContent = jsonObject.getString(BizKeyConstants.DATA);
                if (Strings.isNullOrEmpty(dataContent)) {
                    return null;
                }
                return JSON.parseObject(dataContent, type, parserConfig, featureValues, features);

                // 非200错误，抛出业务异常
            } else {
                commonResultModel.setResultMessage(jsonObject.getString(BizKeyConstants.RESULT_MESSAGE));
                // 平台方错误，错误代码为400
                if (resultCode == OpenApiConstants.RESULT_CODE_PLATFORM_ERROR) {
                    String subCode = jsonObject.getString(BizKeyConstants.RESULT_SUBCODE);
                    String data = jsonObject.getString(BizKeyConstants.DATA);
                    commonResultModel.setSubCode(subCode);
                    //noinspection unchecked
                    commonResultModel.setData(data);
                }
                throw new SdkBizException(commonResultModel);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            value.close();
        }
    }

    public ParserConfig getParserConfig() {
        return parserConfig;
    }

    public FubeiOpenApiResponseBodyConverter<T> setParserConfig(ParserConfig parserConfig) {
        this.parserConfig = parserConfig;
        return this;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public FubeiOpenApiResponseBodyConverter<T> setFeatures(Feature[] features) {
        this.features = features;
        return this;
    }
}
