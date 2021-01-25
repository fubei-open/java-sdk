/**
 * fshows.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.fshows.fubei.biz.agent.model.entity.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * @author zhoujp
 * @version OrderPayModel.java, v 0.1 2021-01-25 11:58 zhoujp
 */
@SuppressWarnings("unused")
public class OrderPayModel implements BaseModel {

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;
    /**
     * 外部系统订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;
    /**
     * 机构订单号（显示在微信/支付宝支付凭证的订单号）
     */
    @JSONField(name = "ins_order_sn")
    private String insOrderSn;
    /**
     * 通道订单号，微信订单号、支付宝订单号等，当支付成功时返回
     */
    @JSONField(name = "channel_order_sn")
    private String channelOrderSn;
    /**
     * 商户id
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;
    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;
    /**
     * 订单状态：
     * USERPAYING--用户支付中
     * SUCCESS--支付成功
     */
    @JSONField(name = "order_status")
    private String orderStatus;
    /**
     * 支付方式，wxpay 微信，alipay 支付宝，unionpay 银联
     */
    @JSONField(name = "pay_type")
    private String payType;
    /**
     * 订单金额，精确到0.01
     */
    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;
    /**
     * 实收金额，精确到0.01，当支付成功时返回
     */
    @JSONField(name = "net_amount")
    private BigDecimal netAmount;
    /**
     * 买家实际支付金额，精确到0.01，当支付成功时返回
     */
    @JSONField(name = "buyer_pay_amount")
    private BigDecimal buyerPayAmount;
    /**
     * 手续费（直连没有手续费返回），精确到0.01，当支付成功时返回
     */
    @JSONField(name = "fee")
    private BigDecimal fee;
    /**
     * 商户门店号
     */
    @JSONField(name = "store_id")
    private Integer storeId;
    /**
     * 付款用户id，“微信openid”、“支付宝账户”等，当支付成功时返回
     */
    @JSONField(name = "user_id")
    private String userId;
    /**
     * 支付完成时间，格式为yyyyMMddHHmmss，当支付成功时返回
     */
    @JSONField(name = "finish_time")
    private String finishTime;
    /**
     * 终端号
     */
    @JSONField(name = "device_no")
    private String deviceNo;
    /**
     * 附加数据，原样返回，该字段主要用于商户携带订单的自定义数据
     */
    @JSONField(name = "attach")
    private String attach;
    /**
     * 活动优惠列表
     */
    @JSONField(name = "payment_list")
    private String paymentList;
    /**
     * 支付宝业务拓展参数--花呗分期
     */
    @JSONField(name = "alipay_extend_params")
    private String alipayExtendParams;

    /**
     * Getter method for property <tt>orderSn</tt>.
     *
     * @return property value of orderSn
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * Setter method for property <tt>orderSn</tt>.
     *
     * @param orderSn value to be assigned to property orderSn
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * Getter method for property <tt>merchantOrderSn</tt>.
     *
     * @return property value of merchantOrderSn
     */
    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    /**
     * Setter method for property <tt>merchantOrderSn</tt>.
     *
     * @param merchantOrderSn value to be assigned to property merchantOrderSn
     */
    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    /**
     * Getter method for property <tt>insOrderSn</tt>.
     *
     * @return property value of insOrderSn
     */
    public String getInsOrderSn() {
        return insOrderSn;
    }

    /**
     * Setter method for property <tt>insOrderSn</tt>.
     *
     * @param insOrderSn value to be assigned to property insOrderSn
     */
    public void setInsOrderSn(String insOrderSn) {
        this.insOrderSn = insOrderSn;
    }

    /**
     * Getter method for property <tt>channelOrderSn</tt>.
     *
     * @return property value of channelOrderSn
     */
    public String getChannelOrderSn() {
        return channelOrderSn;
    }

    /**
     * Setter method for property <tt>channelOrderSn</tt>.
     *
     * @param channelOrderSn value to be assigned to property channelOrderSn
     */
    public void setChannelOrderSn(String channelOrderSn) {
        this.channelOrderSn = channelOrderSn;
    }

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

    /**
     * Getter method for property <tt>cashierId</tt>.
     *
     * @return property value of cashierId
     */
    public Integer getCashierId() {
        return cashierId;
    }

    /**
     * Setter method for property <tt>cashierId</tt>.
     *
     * @param cashierId value to be assigned to property cashierId
     */
    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    /**
     * Getter method for property <tt>orderStatus</tt>.
     *
     * @return property value of orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Setter method for property <tt>orderStatus</tt>.
     *
     * @param orderStatus value to be assigned to property orderStatus
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Getter method for property <tt>payType</tt>.
     *
     * @return property value of payType
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Setter method for property <tt>payType</tt>.
     *
     * @param payType value to be assigned to property payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * Getter method for property <tt>totalAmount</tt>.
     *
     * @return property value of totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter method for property <tt>totalAmount</tt>.
     *
     * @param totalAmount value to be assigned to property totalAmount
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter method for property <tt>netAmount</tt>.
     *
     * @return property value of netAmount
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Setter method for property <tt>netAmount</tt>.
     *
     * @param netAmount value to be assigned to property netAmount
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Getter method for property <tt>buyerPayAmount</tt>.
     *
     * @return property value of buyerPayAmount
     */
    public BigDecimal getBuyerPayAmount() {
        return buyerPayAmount;
    }

    /**
     * Setter method for property <tt>buyerPayAmount</tt>.
     *
     * @param buyerPayAmount value to be assigned to property buyerPayAmount
     */
    public void setBuyerPayAmount(BigDecimal buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    /**
     * Getter method for property <tt>fee</tt>.
     *
     * @return property value of fee
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Setter method for property <tt>fee</tt>.
     *
     * @param fee value to be assigned to property fee
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * Getter method for property <tt>storeId</tt>.
     *
     * @return property value of storeId
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * Setter method for property <tt>storeId</tt>.
     *
     * @param storeId value to be assigned to property storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>finishTime</tt>.
     *
     * @return property value of finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * Setter method for property <tt>finishTime</tt>.
     *
     * @param finishTime value to be assigned to property finishTime
     */
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * Getter method for property <tt>deviceNo</tt>.
     *
     * @return property value of deviceNo
     */
    public String getDeviceNo() {
        return deviceNo;
    }

    /**
     * Setter method for property <tt>deviceNo</tt>.
     *
     * @param deviceNo value to be assigned to property deviceNo
     */
    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    /**
     * Getter method for property <tt>attach</tt>.
     *
     * @return property value of attach
     */
    public String getAttach() {
        return attach;
    }

    /**
     * Setter method for property <tt>attach</tt>.
     *
     * @param attach value to be assigned to property attach
     */
    public void setAttach(String attach) {
        this.attach = attach;
    }

    /**
     * Getter method for property <tt>paymentList</tt>.
     *
     * @return property value of paymentList
     */
    public String getPaymentList() {
        return paymentList;
    }

    /**
     * Setter method for property <tt>paymentList</tt>.
     *
     * @param paymentList value to be assigned to property paymentList
     */
    public void setPaymentList(String paymentList) {
        this.paymentList = paymentList;
    }

    /**
     * Getter method for property <tt>alipayExtendParams</tt>.
     *
     * @return property value of alipayExtendParams
     */
    public String getAlipayExtendParams() {
        return alipayExtendParams;
    }

    /**
     * Setter method for property <tt>alipayExtendParams</tt>.
     *
     * @param alipayExtendParams value to be assigned to property alipayExtendParams
     */
    public void setAlipayExtendParams(String alipayExtendParams) {
        this.alipayExtendParams = alipayExtendParams;
    }
}