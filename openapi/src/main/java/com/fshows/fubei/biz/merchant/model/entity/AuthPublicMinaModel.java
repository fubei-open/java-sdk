package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 微信小程序授权接口返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id AuthPublicMinaModel.java, v1.0 2019-06-11 10:36 John Exp$
 */
@SuppressWarnings("unused")
public class AuthPublicMinaModel implements BaseModel {
    /**
     * 小程序用户open_id
     */
    @JSONField(name = "sub_openid")
    private String subOpenid;

    public String getSubOpenid() {
        return subOpenid;
    }

    public void setSubOpenid(String subOpenid) {
        this.subOpenid = subOpenid;
    }
}
