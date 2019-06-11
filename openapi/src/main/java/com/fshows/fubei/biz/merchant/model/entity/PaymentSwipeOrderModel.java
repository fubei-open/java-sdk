package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * 刷卡支付结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentSwipeOrderModel.java, v1.0 2019-06-10 00:24 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentSwipeOrderModel implements BaseModel {
    /**
     * 第三方商户的订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;
    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;
    /**
     * 交易状态, USERPAYING :用户支付中; SUCCESS:交易成功
     */
    @JSONField(name = "trade_state")
    private String tradeState;
    /**
     * 实收金额（元）
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;
    /**
     * 支付时间（秒）
     */
    @JSONField(name = "pay_time")
    private Integer payTime;
    /**
     * 1 微信刷卡 2支付宝刷卡
     */
    @JSONField(name = "type")
    private Integer type;
    /**
     * 折扣减掉的金额【trade_state等于 SUCCESS 才有返回】
     */
    @JSONField(name = "discount_money")
    private BigDecimal discountMoney;
    /**
     * 买家实际支付的金额【trade_state等于 SUCCESS 才有返回】
     */
    @JSONField(name = "buyer_pay_amount")
    private BigDecimal buyerPayAmount;
    /**
     * 附加数据
     */
    @JSONField(name = "attach")
    private String attach;
    /**
     * 付呗系统的门店id
     */
    @JSONField(name = "store_id")
    private Integer storeId;
    /**
     * 付呗系统的收银员id
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;
    /**
     * 设备终端号
     */
    @JSONField(name = "device_no")
    private String deviceNo;
    /**
     * 对交易或商品的描述（微信上body值显示在商品，支付宝上body值显示在商品说明）
     */
    @JSONField(name = "body")
    private String body;
    /**
     * 微信顾客支付授权的“open_id”或者支付宝顾客的“buyer_user_id”
     */
    @JSONField(name = "user_id")
    private String userId;
    /**
     * 支付宝顾客的账号
     */
    @JSONField(name = "user_logon_id")
    private String userLogonId;

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public BigDecimal getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(BigDecimal buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
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

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLogonId() {
        return userLogonId;
    }

    public void setUserLogonId(String userLogonId) {
        this.userLogonId = userLogonId;
    }
}
