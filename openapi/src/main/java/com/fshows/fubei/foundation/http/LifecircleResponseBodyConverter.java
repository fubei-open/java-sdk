package com.fshows.fubei.foundation.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.fshows.fubei.foundation.constants.BizKeyConstants;
import com.fshows.fubei.foundation.model.CommonResultModel;
import com.fshows.fubei.foundation.support.FastJsonConfig;
import com.google.common.base.Strings;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 生活圈接口响应转换
 *
 * @author John (linwei@fshows.com)
 * @version $Id LifecircleResponseBodyConverter.java, v1.0 2019-06-06 23:14 John Exp$
 */
@SuppressWarnings("unused")
public class LifecircleResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private ParserConfig parserConfig = FastJsonConfig.DEFAULT_PARSER_CONFIG;
    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;
    private Feature[] features;

    /**
     * 数据类型
     */
    private Type type;

    LifecircleResponseBodyConverter(Type type) {
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
            String body = value.string();
            if (type == CommonResultModel.class.getComponentType()) {
                return JSON.parseObject(body, type, parserConfig, featureValues, features);
            } else {
                CommonResultModel commonResultModel = new CommonResultModel();
                JSONObject jsonObject = JSON.parseObject(body);
                commonResultModel.setResultCode(jsonObject.getInteger(BizKeyConstants.RESULT_CODE));
                commonResultModel.setResultMessage(jsonObject.getString(BizKeyConstants.RESULT_MESSAGE));
                String dataContent = jsonObject.getString(BizKeyConstants.DATA);
                if (Strings.isNullOrEmpty(dataContent)) {
                    return null;
                }
                return JSON.parseObject(dataContent, type, parserConfig, featureValues, features);
            }
        } finally {
            value.close();
        }
    }

    public ParserConfig getParserConfig() {
        return parserConfig;
    }

    public LifecircleResponseBodyConverter<T> setParserConfig(ParserConfig parserConfig) {
        this.parserConfig = parserConfig;
        return this;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public LifecircleResponseBodyConverter<T> setFeatures(Feature[] features) {
        this.features = features;
        return this;
    }
}
