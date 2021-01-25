package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;
import java.util.Map;

public class OrderCreateModel implements BaseModel {
    @JSONField(name = "order_sn")
    private String orderSn;

    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    @JSONField(name = "prepay_id")
    private String prepayId;

    @JSONField(name = "merchant_id")
    private String merchantId;

    @JSONField(name = "pay_type")
    private String payType;

    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;

    @JSONField(name = "store_id")
    private Integer storeId;

    @JSONField(name = "cashier_id")
    private Integer cashierId;

    @JSONField(name = "user_id")
    private String userId;

    @JSONField(name = "device_no")
    private String deviceNo;

    @JSONField(name = "attach")
    private String attach;

    @JSONField(name = "sign_package")
    private Map<String, String> signPackage;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Map<String, String> getSignPackage() {
        return signPackage;
    }

    public void setSignPackage(Map<String, String> signPackage) {
        this.signPackage = signPackage;
    }
}
