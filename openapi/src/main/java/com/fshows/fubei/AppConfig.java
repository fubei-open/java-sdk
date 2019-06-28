package com.fshows.fubei;

/**
 * 应用配置
 *
 * @author John (linwei@fshows.com)
 * @version $Id AppConfig.java, v1.0 2019-06-06 17:53 John Exp$
 */
@SuppressWarnings("unused")
public class AppConfig {
    /**
     * 单例类
     */
    private static final AppConfig INSTANCE = new AppConfig();

    /**
     * 获得单例类
     * @return AppConfig对象
     */
    public static AppConfig getInstance() {
        return INSTANCE;
    }

    /**
     * AppId
     */
    private String appId;

    /**
     * appSecret
     */
    private String appSecret;

    /**
     * vendorSn 商户Id
     */
    private String vendorSn;

    /**
     * 商户Secret
     */
    private String vendorSecret;

    /**
     * api环境
     */
    private int env;

    /**
     * Http接口连接超时时间，单位：秒
     */
    private int httpConnectTimeout = 15;

    /**
     * Http下行读取超时时间，单位：秒
     */
    private int httpReadTimeout = 30;

    /**
     * Http上行写入超时时间，单位：秒
     */
    private int httpWriteTimeout = 30;

    /**
     * 设置debug模式，debug模式会打印完整的网络请求BODY
     */
    private boolean debug = false;

    public int getEnv() {
        return env;
    }

    public void setEnv(int env) {
        this.env = env;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public int getHttpConnectTimeout() {
        return httpConnectTimeout;
    }

    public void setHttpConnectTimeout(int httpConnectTimeout) {
        this.httpConnectTimeout = httpConnectTimeout;
    }

    public int getHttpReadTimeout() {
        return httpReadTimeout;
    }

    public void setHttpReadTimeout(int httpReadTimeout) {
        this.httpReadTimeout = httpReadTimeout;
    }

    public int getHttpWriteTimeout() {
        return httpWriteTimeout;
    }

    public void setHttpWriteTimeout(int httpWriteTimeout) {
        this.httpWriteTimeout = httpWriteTimeout;
    }

    public String getVendorSn() {
        return vendorSn;
    }

    public void setVendorSn(String vendorSn) {
        this.vendorSn = vendorSn;
    }

    public String getVendorSecret() {
        return vendorSecret;
    }

    public void setVendorSecret(String vendorSecret) {
        this.vendorSecret = vendorSecret;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}
