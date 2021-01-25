package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店状态
 *
 * @author John (linwei@fshows.com)
 * @version $Id StoreStatusModel.java, v1.0 2019-06-28 16:11 John Exp$
 */
@SuppressWarnings("unused")
public class StoreStatusModel implements BaseModel {

    /**
     * 门店名称
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 当前渠道下对应的微信子商户号
     */
    @JSONField(name = "sub_mch_id")
    private String subMchId;
    /**
     * 当前渠道下对应的支付宝子商户号
     */
    @JSONField(name = "alipay_msid")
    private String alipayMsid;
    /**
     * 门店状态
     */
    @JSONField(name = "store_status")
    private Integer storeStatus;
    /**
     * 门店错误信息
     */
    @JSONField(name = "store_error_msg")
    private String storeErrorMsg;
    /**
     * 商户微信认证状态：UNAUTHORIZED 已认证、AUTHORIZED 未认证、UNKNOWN 未知
     */
    @JSONField(name = "wechat_auth_status")
    private String wechatAuthStatus;

    /**
     * Getter method for property <tt>wechatAuthStatus</tt>.
     *
     * @return property value of wechatAuthStatus
     */
    public String getWechatAuthStatus() {
        return wechatAuthStatus;
    }

    /**
     * Setter method for property <tt>wechatAuthStatus</tt>.
     *
     * @param wechatAuthStatus value to be assigned to property wechatAuthStatus
     */
    public void setWechatAuthStatus(String wechatAuthStatus) {
        this.wechatAuthStatus = wechatAuthStatus;
    }

    /**
     * Getter method for property <tt>subMchId</tt>.
     *
     * @return property value of subMchId
     */
    public String getSubMchId() {
        return subMchId;
    }

    /**
     * Setter method for property <tt>subMchId</tt>.
     *
     * @param subMchId value to be assigned to property subMchId
     */
    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    /**
     * Getter method for property <tt>alipayMsid</tt>.
     *
     * @return property value of alipayMsid
     */
    public String getAlipayMsid() {
        return alipayMsid;
    }

    /**
     * Setter method for property <tt>alipayMsid</tt>.
     *
     * @param alipayMsid value to be assigned to property alipayMsid
     */
    public void setAlipayMsid(String alipayMsid) {
        this.alipayMsid = alipayMsid;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStoreErrorMsg() {
        return storeErrorMsg;
    }

    public void setStoreErrorMsg(String storeErrorMsg) {
        this.storeErrorMsg = storeErrorMsg;
    }
}
