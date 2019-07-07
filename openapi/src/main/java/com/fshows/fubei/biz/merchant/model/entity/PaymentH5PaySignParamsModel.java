package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 公众号支付，唤起支付签名包返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentH5PaySignParamsModel.java, v1.0 2019-07-08 07:40 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentH5PaySignParamsModel implements BaseModel {

    /**
     * 商户注册具有支付权限的公众号成功后即可获得
     */
    @JSONField(name = "appId")
    private String appId;

    /**
     * 当前的时间，自1970年以来的秒数
     */
    @JSONField(name = "timeStamp")
    private String timeStamp;

    /**
     * 随机字符串，不长于32位
     */
    @JSONField(name = "nonceStr")
    private String nonceStr;

    /**
     * 统一下单接口返回的prepay_id参数值，提交格式如：prepay_id=123456
     */
    @JSONField(name = "package")
    private String packageData;

    /**
     * 签名类型，默认为MD5
     */
    @JSONField(name = "signType")
    private String signType;

    /**
     * 签名
     */
    @JSONField(name = "paySign")
    private String paySign;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPackageData() {
        return packageData;
    }

    public void setPackageData(String packageData) {
        this.packageData = packageData;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }
}
