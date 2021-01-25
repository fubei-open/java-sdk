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
public class OrderCreateModel implements BaseModel {

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
     * 预支付凭证，微信预支付订单号prepay_id、支付宝交易号tradeNO等
     */
    @JSONField(name = "prepay_id")
    private String prepayId;
    /**
     * 商户id
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;
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
     * 商户门店号
     */
    @JSONField(name = "store_id")
    private Integer storeId;
    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;
    /**
     * 付款用户id，“微信openid”、“支付宝账户”等，当支付成功时返回
     */
    @JSONField(name = "user_id")
    private String userId;
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
     * 签名包，当pay_type为wxpay时才返回该字段
     */
    @JSONField(name = "sign_package")
    private String signPackage;

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
     * Getter method for property <tt>prepayId</tt>.
     *
     * @return property value of prepayId
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * Setter method for property <tt>prepayId</tt>.
     *
     * @param prepayId value to be assigned to property prepayId
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
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
     * Getter method for property <tt>signPackage</tt>.
     *
     * @return property value of signPackage
     */
    public String getSignPackage() {
        return signPackage;
    }

    /**
     * Setter method for property <tt>signPackage</tt>.
     *
     * @param signPackage value to be assigned to property signPackage
     */
    public void setSignPackage(String signPackage) {
        this.signPackage = signPackage;
    }
}