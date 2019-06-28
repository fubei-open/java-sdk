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
    private Integer appId;

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
     * 商户认证状态
     */
    @JSONField(name = "merchant_status")
    private Integer merchantStatus;

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

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
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
