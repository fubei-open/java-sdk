package com.fshows.lifecircle.foundation.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.annimon.stream.Optional;
import com.fshows.lifecircle.AppConfig;
import com.fshows.lifecircle.foundation.annotation.LifecycleApi;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;
import com.fshows.lifecircle.foundation.model.RequestParam;
import com.fshows.lifecircle.foundation.support.FastJsonConfig;
import com.fshows.lifecircle.foundation.utils.RandomStringUtil;
import com.fshows.lifecircle.foundation.utils.SignUtil;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 生活圈接口请求转换
 *
 * @author John (linwei@fshows.com)
 * @version $Id LifecircleRequestBodyConverter.java, v1.0 2019-06-06 14:05 John Exp$
 */
@SuppressWarnings("unused")
public class LifecircleRequestBodyConverter<T> implements Converter<T, RequestBody> {
    /**
     * 随机位数
     */
    private static final int RANDOM_BIT = 32;
    /**
     * OkHttp数据类型
     */
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    /**
     * JSON序列化配置
     */
    private SerializeConfig serializeConfig = FastJsonConfig.DEFAULT_SERIALIZE_CONFIG;
    /**
     *JSON序列化特性
     */
    private SerializerFeature[] serializerFeatures = SerializerFeature.EMPTY;
    /**
     * 请求中的lifecycleApi标注
     */
    private LifecycleApi lifecycleApi;

    LifecircleRequestBodyConverter(@Nullable LifecycleApi lifecycleApi) {
        if (lifecycleApi != null) {
            this.lifecycleApi = lifecycleApi;
        }
    }

    /**
     * 将对象转为RequestBody
     * @param value bizContent对象
     * @return RequestBody
     */
    @Nullable
    @Override
    public RequestBody convert(@Nonnull T value) {
        RequestParam param;
        if (value instanceof BaseBizContentModel) {
            // 将要转换的对象替换成业务对象
            BaseBizContentModel model = (BaseBizContentModel) value;
            param = RequestParam.create(model);
        } else {
            param = RequestParam.create(new BaseBizContentModel());
        }

        // 设置必须参数
        Optional.ofNullable(lifecycleApi).executeIfPresent(p -> {
            param.setMethod(lifecycleApi.method());
            param.setFormat(lifecycleApi.format());
            param.setVersion(lifecycleApi.version());
        });
        param.setAppId(AppConfig.getInstance().getAppId());
        param.setNonce(RandomStringUtil.randomAlphabet(RANDOM_BIT));
        // 签名
        SignUtil.sign(param, AppConfig.getInstance().getAppSecret());
        byte[] content = JSON.toJSONBytes(param, serializeConfig, serializerFeatures);
        return RequestBody.create(MEDIA_TYPE, content);
    }

    public SerializeConfig getSerializeConfig() {
        return serializeConfig;
    }

    public LifecircleRequestBodyConverter<T> setSerializeConfig(SerializeConfig serializeConfig) {
        this.serializeConfig = serializeConfig;
        return this;
    }

    public SerializerFeature[] getSerializerFeatures() {
        return serializerFeatures;
    }

    public LifecircleRequestBodyConverter<T> setSerializerFeatures(SerializerFeature[] serializerFeatures) {
        this.serializerFeatures = serializerFeatures;
        return this;
    }
}
