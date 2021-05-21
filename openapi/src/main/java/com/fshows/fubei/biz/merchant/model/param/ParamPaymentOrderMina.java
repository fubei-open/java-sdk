package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * 微信小程序支付接口参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderMina.java, v1.0 2019-06-11 10:40 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderMina extends BaseBizContentModel {

    /**
     * 第三方商户的订单号，请确保同一商户号下订单号唯一，前后不允许带空格
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 小程序授权接口返回的sub_openid
     */
    @JSONField(name = "sub_openid")
    private String subOpenid;

    /**
     * 订单金额(单位:元)
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 一个商户下可有多个门店
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;

    /**
     * 对交易或商品的描述（微信上body值显示在商品，支付宝上body值显示在商品说明）
     */
    @JSONField(name = "body")
    private String body;

    /**
     * 附加字段
     */
    @JSONField(name = "attach")
    private String attach;

    /**
     * 回调地址
     */
    @JSONField(name = "call_back")
    private String callback;

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public String getSubOpenid() {
        return subOpenid;
    }

    public void setSubOpenid(String subOpenid) {
        this.subOpenid = subOpenid;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
