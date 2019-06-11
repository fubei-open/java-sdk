package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * 支付宝统一下单接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentAlipayH5.java, v1.0 2019-06-11 10:47 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentAlipayH5 extends BaseBizContentModel {

    /**
     * 第三方商户的订单号,确保唯一，前后不允许带空格
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 订单金额(元)
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 支付宝用户ID,2088开头(获取buyer_id可参考:https://docs.alipay.com/fw/api/105942)
     */
    @JSONField(name = "buyer_id")
    private String buyerId;

    /**
     * 门店ID,当存在多个门店时，此字段必填
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
     * 支付成功后异步通知链接
     */
    @JSONField(name = "call_back_url")
    private String callBackUrl;

    /**
     * 附加字段
     */
    @JSONField(name = "attach")
    private String attach;

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
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

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
