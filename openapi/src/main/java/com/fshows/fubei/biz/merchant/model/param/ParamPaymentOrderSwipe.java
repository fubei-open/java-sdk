package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * 刷卡支付接口参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderSwipe.java, v1.0 2019-06-09 22:14 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderSwipe extends BaseBizContentModel {
    /**
     * 第三方商户订单号，确保唯一，前后不允许带空格
     */
    @JSONField(name = "merchant_order_sn")
    private String merchantOrderSn;

    /**
     * 支付方式
     * 支付方式：微信1/支付宝2
     */
    @JSONField(name = "type")
    private Integer type;

    /**
     * 用户支付授权码
     */
    @JSONField(name = "auth_code")
    private String authCode;

    /**
     * 订单金额(元)
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 门店ID,当存在多个门店时,此字段必填
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;

    /**
     * 设备终端号
     */
    @JSONField(name = "device_no")
    private String deviceNo;

    /**
     * 对交易或商品的描述
     * 微信上body值显示在商品，支付宝上body值显示在商品说明
     */
    @JSONField(name = "body")
    private String body;

    /**
     * 支付成功后回调链接
     */
    @JSONField(name = "call_back_url")
    private String callBackUrl;

    /**
     * 硬件类型(90-127) ,非约定情况下该参数不需要传
     */
    @JSONField(name = "equipment_type")
    private Integer equipmentType;

    /**
     * 是否享受商家折扣
     * 1：享受 0：不享受
     */
    @JSONField(name = "discount_switch")
    private Integer discountSwitch;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
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

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public Integer getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Integer equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Integer getDiscountSwitch() {
        return discountSwitch;
    }

    public void setDiscountSwitch(Integer discountSwitch) {
        this.discountSwitch = discountSwitch;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
