package com.fshows.lifecircle.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 微信小程序授权接口参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamMinaPublicAuth.java, v1.0 2019-06-11 10:34 John Exp$
 */
@SuppressWarnings("unused")
public class ParamMinaPublicAuth extends BaseBizContentModel {
    /**
     * 微信授权码（参见：https://mp.weixin.qq.com/debug/wxadoc/dev/api/api-login.html#wxloginobject）
     */
    @JSONField(name = "code")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
