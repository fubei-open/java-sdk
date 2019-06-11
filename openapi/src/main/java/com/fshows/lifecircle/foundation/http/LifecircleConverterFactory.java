package com.fshows.lifecircle.foundation.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.annimon.stream.Optional;
import com.annimon.stream.Stream;
import com.annimon.stream.function.Predicate;
import com.fshows.lifecircle.foundation.annotation.LifecycleApi;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import javax.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * 生活圈OpenAPI相关的转换工厂类
 *
 * @author John (linwei@fshows.com)
 * @version $Id LifecircleConverterFactory.java, v1.0 2019-06-06 13:33 John Exp$
 */
@SuppressWarnings("unused")
public class LifecircleConverterFactory extends Converter.Factory {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];

    private ParserConfig parserConfig = ParserConfig.getGlobalInstance();
    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;
    private Feature[] features;

    private SerializeConfig serializeConfig;
    private SerializerFeature[] serializerFeatures;

    public LifecircleConverterFactory() {
    }

    /**
     * responseBody的转换器
     *
     * @param type 参数类型
     * @param annotations 参数的注解
     * @param retrofit Retrofit对象
     * @return 转换器
     */
    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type,  Annotation[] annotations, Retrofit retrofit) {
        return new LifecircleResponseBodyConverter<ResponseBody>(type);
    }

    /**
     * requestBody的转换器
     * 将把bizContent的对象转换成为RequestBody对象
     *
     * @param type 参数类型
     * @param parameterAnnotations 参数的注解
     * @param methodAnnotations 方法注解
     * @param retrofit Retrofit对象
     * @return 转换器
     */
    @Override
    @Nullable
    public Converter<?, RequestBody> requestBodyConverter(Type type,  Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        Optional<Annotation> api = Stream.of(methodAnnotations)
                .filter(new Predicate<Annotation>() {
                    @Override
                    public boolean test(Annotation value) {
                        return value instanceof LifecycleApi;
                    }
                })
                .findFirst();

        return new LifecircleRequestBodyConverter<RequestBody>((LifecycleApi) api.orElse(null));
    }
}
