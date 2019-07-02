package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 商户费率修改结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantAdjustRateModel.java, v1.0 2019-07-02 09:26 John Exp$
 */
@SuppressWarnings("unused")
public class MerchantAdjustRateModel implements BaseModel {

    /**
     * 付呗商户号
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;

    /**
     * 接入方商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

    /**
     * 范围3.8~100 单位千分之
     */
    @JSONField(name = "alipay_fee_rate")
    private String alipayFeeRate;

    /**
     * 范围3.8~100 单位千分之
     */
    @JSONField(name = "wx_fee_rate_float")
    private String wxFeeRateFloat;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getAlipayFeeRate() {
        return alipayFeeRate;
    }

    public void setAlipayFeeRate(String alipayFeeRate) {
        this.alipayFeeRate = alipayFeeRate;
    }

    public String getWxFeeRateFloat() {
        return wxFeeRateFloat;
    }

    public void setWxFeeRateFloat(String wxFeeRateFloat) {
        this.wxFeeRateFloat = wxFeeRateFloat;
    }
}
