package com.fshows.lifecircle.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 订单撤销接口（仅支持刷卡支付订单撤销）
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentReverseOrderModel.java, v1.0 2019-06-11 10:20 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentReverseOrderModel extends BaseBizContentModel {

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
