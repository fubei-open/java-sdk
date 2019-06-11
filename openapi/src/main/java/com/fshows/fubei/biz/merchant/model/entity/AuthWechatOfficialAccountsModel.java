package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 微信网页授权结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id AuthWechatOfficialAccountsModel.java, v1.0 2019-06-10 00:58 John Exp$
 */
@SuppressWarnings("unused")
public class AuthWechatOfficialAccountsModel implements BaseModel {
    /**
     * 授权链接
     */
    @JSONField(name = "authUrl")
    private String authUrl;

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }
}
