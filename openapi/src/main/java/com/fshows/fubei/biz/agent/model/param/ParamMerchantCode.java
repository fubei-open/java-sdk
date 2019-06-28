package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 查询商户门店基本信息参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamMerchantCode.java, v1.0 2019-06-28 15:58 John Exp$
 */
@SuppressWarnings("unused")
public class ParamMerchantCode extends BaseBizContentModel {
    /**
     * 查询商户门店基本信息
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }
}
