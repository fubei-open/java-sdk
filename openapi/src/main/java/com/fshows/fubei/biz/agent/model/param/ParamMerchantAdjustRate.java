package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 商户费率修改请求
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamMerchantAdjustRate.java, v1.0 2019-07-02 09:24 John Exp$
 */
@SuppressWarnings("unused")
public class ParamMerchantAdjustRate extends BaseBizContentModel {

    /**
     * 付呗商户号
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;

    /**
     * 商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

    /**
     * 支付宝商户终端费率
     */
    @JSONField(name = "alipay_fee_rate")
    private String alipayFeeRate;

    /**
     * 微信商户终端费率
     */
    @JSONField(name = "wx_fee_rate_float")
    private String wxFeeRateFloat;
    /**
     * 银联商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "union_fee_rate_float")
    private String unionFeeRateFloat;

    /**
     * Getter method for property <tt>unionFeeRateFloat</tt>.
     *
     * @return property value of unionFeeRateFloat
     */
    public String getUnionFeeRateFloat() {
        return unionFeeRateFloat;
    }

    /**
     * Setter method for property <tt>unionFeeRateFloat</tt>.
     *
     * @param unionFeeRateFloat value to be assigned to property unionFeeRateFloat
     */
    public void setUnionFeeRateFloat(String unionFeeRateFloat) {
        this.unionFeeRateFloat = unionFeeRateFloat;
    }

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
