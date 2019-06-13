package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * 扫码支付接口返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentScanOrderModel.java, v1.0 2019-06-10 00:38 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentScanOrderModel implements BaseModel {

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
     * 二维码原文
     */
    @JSONField(name = "qr_code")
    private String qrCode;

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
     * 微信顾客支付授权的"open_id"
     */
    @JSONField(name = "user_id")
    private String userId;

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

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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
