package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 订单剩余可退款查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentRefundStatistics.java, v1.0 2019-06-11 09:48 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentRefundStatistics extends BaseBizContentModel {
    /**
     * 付呗订单号[三选一必填]
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 第三方订单号[三选一必填]
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 商户单号 [三选一必填]
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
