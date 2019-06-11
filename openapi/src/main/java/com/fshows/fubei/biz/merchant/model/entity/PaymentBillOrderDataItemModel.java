package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * 交易查询接口，列表项
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentBillOrderDataItemModel.java, v1.0 2019-06-11 13:15 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentBillOrderDataItemModel implements BaseModel {

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 第三方订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 创建时间
     */
    @JSONField(name = "create_time")
    private Integer createTime;

    /**
     * 订单金额
     */
    @JSONField(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 实收金额
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 手续费
     */
    @JSONField(name = "fee")
    private BigDecimal fee;

    /**
     * 净收入
     */
    @JSONField(name = "income")
    private BigDecimal income;

    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;

    /**
     * 支付时间(秒)
     */
    @JSONField(name = "pay_time")
    private Integer payTime;

    /**
     * 支付方式 1 微信支付 2支付宝
     */
    @JSONField(name = "pay_type")
    private Integer payType;

    /**
     * 折扣金额
     */
    @JSONField(name = "discount_money")
    private BigDecimal discountMoney;

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

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
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

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
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

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }
}
