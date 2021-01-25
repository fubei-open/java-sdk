/**
 * fshows.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.fshows.fubei.biz.agent.model.param.pay;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * @author zhoujp
 * @version ParamOrderPay.java, v 0.1 2021-01-25 11:47 zhoujp
 */
@SuppressWarnings("unused")
public class ParamCreatePay extends BaseBizContentModel {

    /**
     * 外部系统订单号（确保唯一，前后不允许带空格）
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;
    /**
     * 付呗商户号。以服务商级接入时必传，以商户级接入时不传
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;
    /**
     * 支付方式，wxpay 微信，alipay 支付宝
     */
    @JSONField(name = "pay_type")
    private String payType;
    /**
     * 订单总金额，单位为元，精确到0.01 ~ 10000000
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
     * 公众号appid
     */
    @JSONField(name = "sub_appid")
    private String subAppid;
    /**
     * 用户标识（微信openid，支付宝userid）
     */
    @JSONField(name = "user_id")
    private String userId;
    /**
     * 订单优惠标记，代金券或立减优惠功能的参数（使用单品券时必传）
     */
    @JSONField(name = "goods_tag")
    private String goodsTag;
    /**
     * 订单包含的商品信息，Json格式。当微信支付或者支付宝支付时可选填此字段。对于使用单品优惠的商户，该字段必须按照规范上传
     */
    @JSONField(name = "detail")
    private String detail;
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
     * 订单失效时间，逾期将关闭交易。格式为yyyyMMddHHmmss，失效时间需大于1分钟
     * 银联订单请勿传，目前银联不支持该字段
     */
    @JSONField(name = "timeout_express")
    private String timeoutExpress;
    /**
     * 支付回调地址
     */
    @JSONField(name = "notify_url")
    private String notifyUrl;
    /**
     * 支付宝业务拓展参数--花呗分期
     */
    @JSONField(name = "alipay_extend_params")
    private JSONObject alipayExtendParams;

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
     * Getter method for property <tt>subAppid</tt>.
     *
     * @return property value of subAppid
     */
    public String getSubAppid() {
        return subAppid;
    }

    /**
     * Setter method for property <tt>subAppid</tt>.
     *
     * @param subAppid value to be assigned to property subAppid
     */
    public void setSubAppid(String subAppid) {
        this.subAppid = subAppid;
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
     * Getter method for property <tt>goodsTag</tt>.
     *
     * @return property value of goodsTag
     */
    public String getGoodsTag() {
        return goodsTag;
    }

    /**
     * Setter method for property <tt>goodsTag</tt>.
     *
     * @param goodsTag value to be assigned to property goodsTag
     */
    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    /**
     * Getter method for property <tt>detail</tt>.
     *
     * @return property value of detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Setter method for property <tt>detail</tt>.
     *
     * @param detail value to be assigned to property detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
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
     * Getter method for property <tt>timeoutExpress</tt>.
     *
     * @return property value of timeoutExpress
     */
    public String getTimeoutExpress() {
        return timeoutExpress;
    }

    /**
     * Setter method for property <tt>timeoutExpress</tt>.
     *
     * @param timeoutExpress value to be assigned to property timeoutExpress
     */
    public void setTimeoutExpress(String timeoutExpress) {
        this.timeoutExpress = timeoutExpress;
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

    /**
     * Getter method for property <tt>alipayExtendParams</tt>.
     *
     * @return property value of alipayExtendParams
     */
    public JSONObject getAlipayExtendParams() {
        return alipayExtendParams;
    }

    /**
     * Setter method for property <tt>alipayExtendParams</tt>.
     *
     * @param alipayExtendParams value to be assigned to property alipayExtendParams
     */
    public void setAlipayExtendParams(JSONObject alipayExtendParams) {
        this.alipayExtendParams = alipayExtendParams;
    }
}