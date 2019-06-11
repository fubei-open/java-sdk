package com.fshows.lifecircle.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseModel;

/**
 * 关闭订单
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentCloseOrderModel.java, v1.0 2019-06-10 00:26 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentCloseOrderModel implements BaseModel {
    /**
     * 第三方订单号
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

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
}
