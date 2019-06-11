package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 退款查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentQueryRefundOrderModel.java, v1.0 2019-06-11 09:25 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentQueryRefundOrderModel implements BaseModel {
    /**
     * 第三方订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 第三方退款号
     */
    @JSONField(name = "merchant_refund_sn")
    private String merchantRefundSn;

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 付呗退款号
     */
    @JSONField(name = "refund_sn")
    private String refundSn;

    /**
     * 商户单号
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

    /**
     * 退款状态,REFUND_PROCESSING退款中、REFUND_SUCCESS退款成功、REFUND_FAILER退款失败
     */
    @JSONField(name = "refund_status")
    private String refundStatus;

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public String getMerchantRefundSn() {
        return merchantRefundSn;
    }

    public void setMerchantRefundSn(String merchantRefundSn) {
        this.merchantRefundSn = merchantRefundSn;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}
