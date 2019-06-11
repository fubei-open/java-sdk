package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 订单关闭接口参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderClose.java, v1.0 2019-06-06 00:21 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderClose extends BaseBizContentModel {
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

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
