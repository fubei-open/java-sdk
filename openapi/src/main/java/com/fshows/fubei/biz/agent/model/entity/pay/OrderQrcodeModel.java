/**
 * fshows.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.fshows.fubei.biz.agent.model.entity.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * @author zhoujp
 * @version OrderPayModel.java, v 0.1 2021-01-25 11:58 zhoujp
 */
@SuppressWarnings("unused")
public class OrderQrcodeModel implements BaseModel {

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;
    /**
     * 商户订单号
     */
    @JSONField(name = "trade_no")
    private String tradeNo;
    /**
     * 	定额码支付链接
     */
    @JSONField(name = "qr_code")
    private String qrCode;
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
     * Getter method for property <tt>tradeNo</tt>.
     *
     * @return property value of tradeNo
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Setter method for property <tt>tradeNo</tt>.
     *
     * @param tradeNo value to be assigned to property tradeNo
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * Getter method for property <tt>qrCode</tt>.
     *
     * @return property value of qrCode
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Setter method for property <tt>qrCode</tt>.
     *
     * @param qrCode value to be assigned to property qrCode
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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
}