package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 商户入驻结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantIncomeModel.java, v1.0 2019-06-28 17:16 John Exp$
 */
@SuppressWarnings("unused")
public class MerchantIncomeModel implements BaseModel {

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
     * 商户APPID
     */
    @JSONField(name = "app_id")
    private String appId;

    /**
     * 商户秘钥
     */
    @JSONField(name = "app_secret")
    private String appSecret;

    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 当前渠道下对应的微信子商户号
     */
    @JSONField(name = "sub_mch_id")
    private String subMchId;
    /**
     * 当前渠道下对应的支付宝子商户号
     */
    @JSONField(name = "alipay_msid")
    private String alipayMsid;

    /**
     * 商户认证状态
     */
    @JSONField(name = "merchant_status")
    private Integer merchantStatus;
    /**
     * 商户微信认证状态：UNAUTHORIZED 已认证、AUTHORIZED 未认证、UNKNOWN 未知
     */
    @JSONField(name = "wechat_auth_status")
    private String wechatAuthStatus;

    /**
     * 门店状态
     */
    @JSONField(name = "store_status")
    private Integer storeStatus;

    /**
     * 错误信息
     */
    @JSONField(name = "error_msg")
    private String errorMsg;

    /**
     * Getter method for property <tt>subMchId</tt>.
     *
     * @return property value of subMchId
     */
    public String getSubMchId() {
        return subMchId;
    }

    /**
     * Setter method for property <tt>subMchId</tt>.
     *
     * @param subMchId value to be assigned to property subMchId
     */
    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    /**
     * Getter method for property <tt>alipayMsid</tt>.
     *
     * @return property value of alipayMsid
     */
    public String getAlipayMsid() {
        return alipayMsid;
    }

    /**
     * Setter method for property <tt>alipayMsid</tt>.
     *
     * @param alipayMsid value to be assigned to property alipayMsid
     */
    public void setAlipayMsid(String alipayMsid) {
        this.alipayMsid = alipayMsid;
    }

    /**
     * Getter method for property <tt>wechatAuthStatus</tt>.
     *
     * @return property value of wechatAuthStatus
     */
    public String getWechatAuthStatus() {
        return wechatAuthStatus;
    }

    /**
     * Setter method for property <tt>wechatAuthStatus</tt>.
     *
     * @param wechatAuthStatus value to be assigned to property wechatAuthStatus
     */
    public void setWechatAuthStatus(String wechatAuthStatus) {
        this.wechatAuthStatus = wechatAuthStatus;
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
