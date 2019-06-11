package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * 退款接口 参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderRefund.java, v1.0 2019-06-11 09:17 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderRefund extends BaseBizContentModel {
    /**
     * 第三方订单号[三选一必填]
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 付呗订单号[三选一必填]
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 商户单号[三选一必填]
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

    /**
     * 第三方退款号
     */
    @JSONField(name = "merchant_refund_sn")
    private String merchantRefundSn;

    /**
     * 退款金额，为空时默认为全额退款
     */
    @JSONField(name = "refund_money")
    private BigDecimal refundMoney;

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

    public String getMerchantRefundSn() {
        return merchantRefundSn;
    }

    public void setMerchantRefundSn(String merchantRefundSn) {
        this.merchantRefundSn = merchantRefundSn;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }
}
