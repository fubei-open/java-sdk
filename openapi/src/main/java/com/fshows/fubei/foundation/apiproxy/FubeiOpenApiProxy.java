package com.fshows.fubei.foundation.apiproxy;

import com.fshows.fubei.AppConfig;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.http.FubeiOpenApiConverterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;

import java.util.concurrent.TimeUnit;

/**
 * 付呗OpenApi代理类
 *
 *
 * @author John (linwei@fshows.com)
 * @version $Id FubeiOpenApiProxy.java, v1.0 2019-06-28 11:26 John Exp$
 */
public class FubeiOpenApiProxy extends AbstractApiProxy {
    private static final Logger LOGGER = LoggerFactory.getLogger(FubeiOpenApiProxy.class);

    /** 开放平台正式环境 */
    private static final String SHQ_API = "https://shq-api.51fubei.com/";
    /** 开放平台测试环境 */
    private static final String SHQ_API_TEST = "https://shq-api-test.51fubei.com/";
    /** singleton */
    private static FubeiOpenApiProxy API_PROXY = new FubeiOpenApiProxy();

    /**
     * 获得MerchantApiProxy实例
     * @return MerchantApiProxy实例
     */
    public static FubeiOpenApiProxy getInstance() {
        return API_PROXY;
    }

    @Override
    protected void initRetrofit(Retrofit.Builder builder) {
        LOGGER.info("init Retrofit.");
        // 设置BaseUrl和转换工厂
        builder.baseUrl(getBaseUrl()).addConverterFactory(new FubeiOpenApiConverterFactory());
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
        builder.connectTimeout(AppConfig.getInstance().getHttpConnectTimeout(), TimeUnit.SECONDS);
        builder.readTimeout(AppConfig.getInstance().getHttpReadTimeout(), TimeUnit.SECONDS);
        builder.writeTimeout(AppConfig.getInstance().getHttpWriteTimeout(), TimeUnit.SECONDS);

        // 设置日志打印的拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                LOGGER.info("{}", message);
            }
        });
        HttpLoggingInterceptor.Level level = AppConfig.getInstance().isDebug() ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.BASIC;
        loggingInterceptor.setLevel(level);
        builder.addInterceptor(loggingInterceptor);
        return builder.build();
    }

    @Override
    protected String getBaseUrl() {
        return AppConfig.getInstance().getEnv() == OpenApiConstants.ENV_RELEASE ?
                SHQ_API : SHQ_API_TEST;
    }
}
