package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 退款返回实体
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentRefundOrderModel.java, v1.0 2019-06-11 09:19 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentRefundOrderModel implements BaseModel {
    /**
     * 付呗退款号
     */
    @JSONField(name = "refund_sn")
    private String refundSn;

    /**
     * 第三方退款号
     */
    @JSONField(name = "merchant_refund_sn")
    private String merchantRefundSn;

    /**
     * 商户单号
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

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

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public String getMerchantRefundSn() {
        return merchantRefundSn;
    }

    public void setMerchantRefundSn(String merchantRefundSn) {
        this.merchantRefundSn = merchantRefundSn;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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
}
