package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * 订单查询结果
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentQueryOrderModel.java, v1.0 2019-06-10 00:47 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentQueryOrderModel implements BaseModel {
    /**
     * 第三方商户订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 商户单号
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

    /**
     * 平台方订单号
     */
    @JSONField(name = "platform_order_no")
    private String platformOrderNo;

    /**
     * 交易状态, USERPAYING :待支付; SUCCESS:支付成功；REVOKED：已撤销；REVOKING：撤销中；REVOKED_ERROR：撤销失败
     */
    @JSONField(name = "trade_state")
    private String tradeState;

    /**
     * 实收金额(元)
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 手续费(元)
     */
    @JSONField(name = "fee")
    private BigDecimal fee;

    /**
     * 净收金额(元) = 实收金额 - 手续费
     */
    @JSONField(name = "net_money")
    private BigDecimal netMoney;

    /**
     * 支付时间
     */
    @JSONField(name = "pay_time")
    private Integer payTime;

    /**
     * 门店ID 0表示没有门店
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 收银员ID 0表示没有收银员
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
     * 1 微信支付 2 支付宝支付
     */
    @JSONField(name = "type")
    private Integer type;

    /**
     * 商家折扣减的金额
     */
    @JSONField(name = "discount_money")
    private BigDecimal discountMoney;

    /**
     * 买家实际支付的金额
     */
    @JSONField(name = "buyer_pay_amount")
    private BigDecimal buyerPayAmount;

    /**
     * 附加数据
     */
    @JSONField(name = "attach")
    private String attach;

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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getNetMoney() {
        return netMoney;
    }

    public void setNetMoney(BigDecimal netMoney) {
        this.netMoney = netMoney;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
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

    public String getPlatformOrderNo() {
        return platformOrderNo;
    }

    public void setPlatformOrderNo(String platformOrderNo) {
        this.platformOrderNo = platformOrderNo;
    }
}
