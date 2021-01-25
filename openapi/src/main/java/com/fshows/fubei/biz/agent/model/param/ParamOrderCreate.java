package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

public class ParamOrderCreate extends BaseBizContentModel {
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    @JSONField(name = "merchant_id")
    private Integer merchantId;

    @JSONField(name = "pay_type")
    public String payType;

    @JSONField(name = "total_amount")
    private BigDecimal totalAmount;

    @JSONField(name = "store_id")
    private int storeId;

    @JSONField(name = "cashier_id")
    private Integer cashierId;

    @JSONField(name = "sub_appid")
    private String subAppId;

    @JSONField(name = "user_id")
    private String userId;

    @JSONField(name = "goods_tag")
    private String goodsTag;

    @JSONField(name = "detail")
    private Object detail;

    @JSONField(name = "device_no")
    private String deviceNo;

    @JSONField(name = "body")
    private String body;

    @JSONField(name = "attach")
    private String attach;

    @JSONField(name = "timeout_express")
    private String timeoutExpire;

    @JSONField(name = "notify_url")
    private String notifyUrl;

    @JSONField(name = "alipay_extend_params")
    private Object alipayExtendParams;

    public String getMerchantOrderSn() {
        return merchantOrderSn;
    }

    public void setMerchantOrderSn(String merchantOrderSn) {
        this.merchantOrderSn = merchantOrderSn;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
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

    public String getTimeoutExpire() {
        return timeoutExpire;
    }

    public void setTimeoutExpire(String timeoutExpire) {
        this.timeoutExpire = timeoutExpire;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Object getAlipayExtendParams() {
        return alipayExtendParams;
    }

    public void setAlipayExtendParams(Object alipayExtendParams) {
        this.alipayExtendParams = alipayExtendParams;
    }
}
