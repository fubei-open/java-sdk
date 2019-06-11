package com.fshows.lifecircle.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 订单查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderQuery.java, v1.0 2019-06-10 00:43 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderQuery extends BaseBizContentModel {
    /**
     * 第三方订单号[三选一]
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 付呗订单号[三选一]
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 商户单号 [三选一]
     */
    @JSONField(name = "trade_no")
    private String tradeNo;

    /**
     * 设备终端号
     */
    @JSONField(name = "device_no")
    private String deviceNo;

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

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }
}
