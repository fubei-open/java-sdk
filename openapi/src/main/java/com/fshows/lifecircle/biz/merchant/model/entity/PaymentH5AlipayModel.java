package com.fshows.lifecircle.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseModel;

/**
 * 支付宝统一下单接口返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentH5AlipayModel.java, v1.0 2019-06-11 10:49 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentH5AlipayModel implements BaseModel {

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 支付宝预支付订单号
     */
    @JSONField(name = "prepay_id")
    private String prepayId;

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
     * 微信顾客支付授权的“open_id”或者支付宝顾客的“buyer_user_id”
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 支付宝顾客的账号
     */
    @JSONField(name = "user_logon_id")
    private String userLogonId;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
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

    public String getUserLogonId() {
        return userLogonId;
    }

    public void setUserLogonId(String userLogonId) {
        this.userLogonId = userLogonId;
    }
}
