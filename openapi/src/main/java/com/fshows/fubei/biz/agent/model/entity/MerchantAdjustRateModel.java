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
     * 已生效支付宝商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "alipay_fee_rate")
    private String alipayFeeRate;

    /**
     * 已生效微信商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "wx_fee_rate_float")
    private String wxFeeRateFloat;
    /**
     * 已生效微信商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "union_fee_rate_float")
    private String unionFeeRateFloat;

    /**
     * 次日待生效支付宝商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "ineffective_alipay_fee_rate")
    private String ineffectiveAlipayFeeRate;
    /**
     * 次日待生效微信商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "ineffective_wx_fee_rate_float")
    private String ineffectiveWxFeeRateFloat;
    /**
     * 次日待生效微信商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "ineffective_unionFeeRateFloat")
    private String ineffectiveUnionFeeRateFloat;

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

    /**
     * Getter method for property <tt>ineffectiveAlipayFeeRate</tt>.
     *
     * @return property value of ineffectiveAlipayFeeRate
     */
    public String getIneffectiveAlipayFeeRate() {
        return ineffectiveAlipayFeeRate;
    }

    /**
     * Setter method for property <tt>ineffectiveAlipayFeeRate</tt>.
     *
     * @param ineffectiveAlipayFeeRate value to be assigned to property ineffectiveAlipayFeeRate
     */
    public void setIneffectiveAlipayFeeRate(String ineffectiveAlipayFeeRate) {
        this.ineffectiveAlipayFeeRate = ineffectiveAlipayFeeRate;
    }

    /**
     * Getter method for property <tt>ineffectiveWxFeeRateFloat</tt>.
     *
     * @return property value of ineffectiveWxFeeRateFloat
     */
    public String getIneffectiveWxFeeRateFloat() {
        return ineffectiveWxFeeRateFloat;
    }

    /**
     * Setter method for property <tt>ineffectiveWxFeeRateFloat</tt>.
     *
     * @param ineffectiveWxFeeRateFloat value to be assigned to property ineffectiveWxFeeRateFloat
     */
    public void setIneffectiveWxFeeRateFloat(String ineffectiveWxFeeRateFloat) {
        this.ineffectiveWxFeeRateFloat = ineffectiveWxFeeRateFloat;
    }

    /**
     * Getter method for property <tt>ineffectiveUnionFeeRateFloat</tt>.
     *
     * @return property value of ineffectiveUnionFeeRateFloat
     */
    public String getIneffectiveUnionFeeRateFloat() {
        return ineffectiveUnionFeeRateFloat;
    }

    /**
     * Setter method for property <tt>ineffectiveUnionFeeRateFloat</tt>.
     *
     * @param ineffectiveUnionFeeRateFloat value to be assigned to property ineffectiveUnionFeeRateFloat
     */
    public void setIneffectiveUnionFeeRateFloat(String ineffectiveUnionFeeRateFloat) {
        this.ineffectiveUnionFeeRateFloat = ineffectiveUnionFeeRateFloat;
    }
}
