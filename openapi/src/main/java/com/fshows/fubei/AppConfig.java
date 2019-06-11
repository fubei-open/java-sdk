package com.fshows.fubei;

/**
 * 应用配置
 *
 * @author John (linwei@fshows.com)
 * @version $Id AppConfig.java, v1.0 2019-06-06 17:53 John Exp$
 */
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

    /**  AppId */
    private String appId;

    /**  appSecret */
    private String appSecret;

    /** api环境 */
    private int env;

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
}
