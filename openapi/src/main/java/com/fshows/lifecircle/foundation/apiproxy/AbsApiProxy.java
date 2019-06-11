package com.fshows.lifecircle.foundation.apiproxy;

import retrofit2.Retrofit;

/**
 * Api代理抽象类
 *
 * @author John (linwei@fshows.com)
 * @version $Id ApiProxy.java, v1.0 2019-06-11 16:32 John Exp$
 */
public abstract class AbsApiProxy {
    /**
     * Retrofit
     */
    private Retrofit retrofit;

    /**
     * 构造函数
     */
    AbsApiProxy() {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
        initRetrofit(retrofitBuilder);
        retrofit = retrofitBuilder.build();
    }

    /**
     * 初始化Retrofit
     * @param builder retrofit builder
     */
    protected abstract void initRetrofit(Retrofit.Builder builder);

    protected abstract String getBaseUrl();

    /**
     *
     * @param clazz 接口类class
     * @param <T> 接口
     */
    public <T> T create(Class<T> clazz) {
        return retrofit.create(clazz);
    }
}
