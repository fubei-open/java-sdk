package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

public class OrderPayModel implements BaseModel {
    @JSONField(name = "order_sn")
    private String orderSn;

    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    @JSONField(name = "ins_order_sn")
    private String insOrderSn;

    @JSONField(name = "channel_order_sn")
    private String channelOrderSn;

    @JSONField(name = "merchant_id")
    private Integer merchantId;

    @JSONField(name = "cashier_id")
    private Integer cashierId;

    @JSONField(name = "order_status")
    private String orderStatus;

    @JSONField(name = "pay_type")
    private String payType;

    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;

    @JSONField(name = "net_amount")
    private BigDecimal netAmount;

    @JSONField(name = "buyer_pay_amount")
    private BigDecimal buyerPayAmount;

    @JSONField(name = "fee")
    private BigDecimal fee;

    @JSONField(name = "store_id")
    private Integer storeId;

    @JSONField(name = "user_id")
    private String userId;

    @JSONField(name = "finish_time")
    private String finishTime;

    @JSONField(name = "device_no")
    private String deviceNo;

    @JSONField(name = "attach")
    private String attach;

    @JSONField(name = "payment_list")
    private String paymentList;

    @JSONField(name = "alipay_extend_params")
    private Object alipayExtendParams;

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

    public String getInsOrderSn() {
        return insOrderSn;
    }

    public void setInsOrderSn(String insOrderSn) {
        this.insOrderSn = insOrderSn;
    }

    public String getChannelOrderSn() {
        return channelOrderSn;
    }

    public void setChannelOrderSn(String channelOrderSn) {
        this.channelOrderSn = channelOrderSn;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(BigDecimal buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
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

    public String getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(String paymentList) {
        this.paymentList = paymentList;
    }

    public Object getAlipayExtendParams() {
        return alipayExtendParams;
    }

    public void setAlipayExtendParams(Object alipayExtendParams) {
        this.alipayExtendParams = alipayExtendParams;
    }
}
