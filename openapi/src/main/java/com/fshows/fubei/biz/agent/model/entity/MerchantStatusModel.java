package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.util.List;

/**
 * 商户状态
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantStatusModel.java, v1.0 2019-06-28 16:12 John Exp$
 */
@SuppressWarnings("unused")
public class MerchantStatusModel implements BaseModel {

    /**
     * 商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;
    /**
     * 付呗商户号
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;
    /**
     * 认证状态
     */
    @JSONField(name = "merchant_status")
    private Integer merchantStatus;

    /**
     * 商户状态错误信息
     */
    @JSONField(name = "err_msg")
    private String errMsg;

    /**
     * 门店信息列表
     */
    @JSONField(name = "store_list")
    private List<StoreStatusModel> storeList;

    /**
     * Getter method for property <tt>merchantId</tt>.
     *
     * @return property value of merchantId
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * Setter method for property <tt>merchantId</tt>.
     *
     * @param merchantId value to be assigned to property merchantId
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public Integer getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Integer merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public List<StoreStatusModel> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<StoreStatusModel> storeList) {
        this.storeList = storeList;
    }
}
