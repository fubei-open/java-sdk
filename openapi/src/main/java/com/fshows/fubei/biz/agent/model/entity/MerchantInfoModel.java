package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.util.List;

/**
 * 商户信息Model
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantInfoModel.java, v1.0 2019-06-28 16:02 John Exp$
 */
@SuppressWarnings("unused")
public class MerchantInfoModel implements BaseModel {
    /**
     * 商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

    /**
     * 商户号
     */
    @JSONField(name = "merchant_id")
    private String merchantId;

    /**
     * 真实姓名
     */
    @JSONField(name = "real_name")
    private String realName;

    /**
     * 商户手机号
     */
    @JSONField(name = "contact_phone")
    private String contactPhone;

    /**
     * 客服电话
     */
    @JSONField(name = "service_phone")
    private String servicePhone;

    /**
     * 电子邮箱
     */
    @JSONField(name = "email")
    private String email;

    /**
     * 品类id
     */
    @JSONField(name = "unity_category_id")
    private Integer unityCategoryId;

    /**
     * 省份编码
     */
    @JSONField(name = "province_code")
    private String provinceCode;

    /**
     * 城市编码
     */
    @JSONField(name = "city_code")
    private String cityCode;

    /**
     * 区域编码
     */
    @JSONField(name = "area_code")
    private String areaCode;

    /**
     * 详细地址
     */
    @JSONField(name = "street_address")
    private String streetAddress;

    /**
     * 进件状态
     */
    @JSONField(name = "income_status")
    private Integer incomeStatus;

    /**
     * 认证状态
     */
    @JSONField(name = "auth_status")
    private Integer authStatus;

    /**
     * 账户类型
     */
    @JSONField(name = "account_type")
    private Integer accountType;

    /**
     * 银行卡号
     */
    @JSONField(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 银行卡照片地址
     */
    @JSONField(name = "bank_card_image")
    private String bankCardImage;

    /**
     * 银行名称
     */
    @JSONField(name = "bank_name")
    private String bankName;

    /**
     * 支行名称
     */
    @JSONField(name = "branch_name")
    private String branchName;

    /**
     * 大小额联行号
     */
    @JSONField(name = "unionpay_code")
    private String unionpayCode;

    /**
     * 所属银行编码
     */
    @JSONField(name = "bank_code")
    private String bankCode;

    /**
     * 银行预留手机号
     */
    @JSONField(name = "bank_cell_phone")
    private String bankCellPhone;

    /**
     * 身份证号
     */
    @JSONField(name = "id_card_no")
    private String idCardNo;

    /**
     * 身份证正面照地址
     */
    @JSONField(name = "id_card_front_photo")
    private String idCardFrontPhoto;

    /**
     * 身份证反面照地址
     */
    @JSONField(name = "id_card_back_photo")
    private String idCardBackPhoto;

    /**
     * 支付宝商户终端费率
     */
    @JSONField(name = "alipay_fee_rate")
    private String alipayFeeRate;

    /**
     * 微信商户终端费率
     */
    @JSONField(name = "wx_fee_rate_float")
    private String wxFeeRateFloat;
    /**
     * 银联商户终端费率（‰），范围：3.8~100
     */
    @JSONField(name = "union_fee_rate_float")
    private String unionFeeRateFloat;
    /**
     * 支付回调地址
     */
    @JSONField(name = "call_back")
    private String callBack;
    /**
     * 商户APPID
     */
    @JSONField(name = "app_id")
    private String appId;

    /**
     * 商户秘钥
     */
    @JSONField(name = "app_secret")
    private String appSecret;

    /**
     * 门店信息列表
     */
    @JSONField(name = "store_info_list")
    private List<StoreInfoModel> storeInfoList;

    /**
     * Getter method for property <tt>unionFeeRateFloat</tt>.
     *
     * @return property value of unionFeeRateFloat
     */
    public String getUnionFeeRateFloat() {
        return unionFeeRateFloat;
    }

    /**
     * Setter method for property <tt>unionFeeRateFloat</tt>.
     *
     * @param unionFeeRateFloat value to be assigned to property unionFeeRateFloat
     */
    public void setUnionFeeRateFloat(String unionFeeRateFloat) {
        this.unionFeeRateFloat = unionFeeRateFloat;
    }

    /**
     * Getter method for property <tt>callBack</tt>.
     *
     * @return property value of callBack
     */
    public String getCallBack() {
        return callBack;
    }

    /**
     * Setter method for property <tt>callBack</tt>.
     *
     * @param callBack value to be assigned to property callBack
     */
    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    /**
     * Getter method for property <tt>appId</tt>.
     *
     * @return property value of appId
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Setter method for property <tt>appId</tt>.
     *
     * @param appId value to be assigned to property appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Getter method for property <tt>appSecret</tt>.
     *
     * @return property value of appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * Setter method for property <tt>appSecret</tt>.
     *
     * @param appSecret value to be assigned to property appSecret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUnityCategoryId() {
        return unityCategoryId;
    }

    public void setUnityCategoryId(Integer unityCategoryId) {
        this.unityCategoryId = unityCategoryId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Integer getIncomeStatus() {
        return incomeStatus;
    }

    public void setIncomeStatus(Integer incomeStatus) {
        this.incomeStatus = incomeStatus;
    }

    public Integer getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankCardImage() {
        return bankCardImage;
    }

    public void setBankCardImage(String bankCardImage) {
        this.bankCardImage = bankCardImage;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getUnionpayCode() {
        return unionpayCode;
    }

    public void setUnionpayCode(String unionpayCode) {
        this.unionpayCode = unionpayCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCellPhone() {
        return bankCellPhone;
    }

    public void setBankCellPhone(String bankCellPhone) {
        this.bankCellPhone = bankCellPhone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardFrontPhoto() {
        return idCardFrontPhoto;
    }

    public void setIdCardFrontPhoto(String idCardFrontPhoto) {
        this.idCardFrontPhoto = idCardFrontPhoto;
    }

    public String getIdCardBackPhoto() {
        return idCardBackPhoto;
    }

    public void setIdCardBackPhoto(String idCardBackPhoto) {
        this.idCardBackPhoto = idCardBackPhoto;
    }

    public String getAlipayFeeRate() {
        return alipayFeeRate;
    }

    public void setAlipayFeeRate(String alipayFeeRate) {
        this.alipayFeeRate = alipayFeeRate;
    }

    public String getWxFeeRateFloat() {
        return wxFeeRateFloat;
    }

    public void setWxFeeRateFloat(String wxFeeRateFloat) {
        this.wxFeeRateFloat = wxFeeRateFloat;
    }

    public List<StoreInfoModel> getStoreInfoList() {
        return storeInfoList;
    }

    public void setStoreInfoList(List<StoreInfoModel> storeInfoList) {
        this.storeInfoList = storeInfoList;
    }
}
