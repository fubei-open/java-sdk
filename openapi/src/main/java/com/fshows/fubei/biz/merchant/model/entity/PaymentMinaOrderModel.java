package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 微信小程序支付接口返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentMinaOrderModel.java, v1.0 2019-06-11 10:42 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentMinaOrderModel implements BaseModel {

    /**
     * 预支付订单号
     */
    @JSONField(name = "prepay_id")
    private String prepayId;

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

    /**
     * 小程序支付签名包(参见https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=5#) 备注：发起小程序支付请务必使用我司提供的签名包
     */
    @JSONField(name = "sign_params")
    private String signParams;

    /**
     * 付呗系统的收银员id
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;

    /**
     * 微信顾客支付授权的“open_id”或者支付宝顾客的“buyer_user_id”
     */
    @JSONField(name = "user_id")
    private String userId;

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
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

    public String getSignParams() {
        return signParams;
    }

    public void setSignParams(String signParams) {
        this.signParams = signParams;
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
