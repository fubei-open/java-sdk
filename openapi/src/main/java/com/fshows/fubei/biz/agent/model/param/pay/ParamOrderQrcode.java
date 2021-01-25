/**
 * fshows.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.fshows.fubei.biz.agent.model.param.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * @author zhoujp
 * @version ParamOrderPay.java, v 0.1 2021-01-25 11:47 zhoujp
 */
@SuppressWarnings("unused")
public class ParamOrderQrcode extends BaseBizContentModel {

    /**
     * 外部系统订单号（确保唯一，前后不允许带空格）
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;
    /**
     * 订单总金额，单位为元，精确到0.01 ~ 10000000
     */
    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;
    /**
     * 支付方式，wxpay 微信，alipay 支付宝
     */
    @JSONField(name = "pay_type")
    private String payType;
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
     * 终端号
     */
    @JSONField(name = "device_no")
    private String deviceNo;
    /**
     * 商品描述
     */
    @JSONField(name = "body")
    private String body;
    /**
     * 附加数据，原样返回，该字段主要用于商户携带订单的自定义数据
     */
    @JSONField(name = "attach")
    private String attach;
    /**
     * 支付回调地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;

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
     * Getter method for property <tt>body</tt>.
     *
     * @return property value of body
     */
    public String getBody() {
        return body;
    }

    /**
     * Setter method for property <tt>body</tt>.
     *
     * @param body value to be assigned to property body
     */
    public void setBody(String body) {
        this.body = body;
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
     * Getter method for property <tt>notifyUrl</tt>.
     *
     * @return property value of notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Setter method for property <tt>notifyUrl</tt>.
     *
     * @param notifyUrl value to be assigned to property notifyUrl
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}