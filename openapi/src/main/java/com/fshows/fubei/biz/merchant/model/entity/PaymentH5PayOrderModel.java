package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * H5支付订单
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentH5PayOrderModel.java, v1.0 2019-06-10 21:26 John Exp$
 */
public class PaymentH5PayOrderModel extends BaseBizContentModel {
    /**
     * 预支付订单号
     */
    @JSONField(name = "prepay_id")
    private String prepayId;

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

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

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
}
