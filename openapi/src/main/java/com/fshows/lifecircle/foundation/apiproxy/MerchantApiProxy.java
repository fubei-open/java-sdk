package com.fshows.lifecircle.foundation.apiproxy;

import com.fshows.lifecircle.AppConfig;
import com.fshows.lifecircle.foundation.constants.OpenApiConstants;
import com.fshows.lifecircle.foundation.http.LifecircleConverterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

import java.util.concurrent.TimeUnit;

/**
 * 商户Api代理
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantApiProxy.java, v1.0 2019-06-11 16:50 John Exp$
 */
public class MerchantApiProxy extends AbsApiProxy {
    /** 开放平台正式环境 */
    private static final String SHQ_API = "https://shq-api.51fubei.com/";
    /** 开放平台测试环境 */
    private static final String SHQ_API_TEST = "https://shq-api-test.51fubei.com/";

    private static MerchantApiProxy API_PROXY = new MerchantApiProxy();

    /**
     * 获得MerchantApiProxy实例
     * @return MerchantApiProxy实例
     */
    public static MerchantApiProxy getInstance() {
        return API_PROXY;
    }

    @Override
    protected void initRetrofit(Retrofit.Builder builder) {
        // 设置BaseUrl和转换工厂
        builder.baseUrl(getBaseUrl()).addConverterFactory(new LifecircleConverterFactory());
        // 设置http client
        builder.client(getOkHttpClient());
    }

    /**
     * 初始化okHttp
     * @return okHttpClient
     */
    @SuppressWarnings("WeakerAccess")
    protected OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(15, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(message -> System.out.println("\t\t" + message));
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(loggingInterceptor);
        return builder.build();
    }

    @Override
    protected String getBaseUrl() {
        return AppConfig.getInstance().getEnv() == OpenApiConstants.ENV_RELEASE ?
                SHQ_API : SHQ_API_TEST;
    }
}
