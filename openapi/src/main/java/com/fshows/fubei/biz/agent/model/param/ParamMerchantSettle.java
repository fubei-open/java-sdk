package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 商户入驻
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamMerchantSettle.java, v1.0 2019-06-28 17:10 John Exp$
 */
@SuppressWarnings("unused")
public class ParamMerchantSettle extends BaseBizContentModel {

    /**
     * 商户号
     */
    @JSONField(name = "merchant_code")
    private String merchantCode;

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
     * 账户类型
     */
    @JSONField(name = "account_type")
    private Integer accountType;

    /**
     * 真实姓名
     */
    @JSONField(name = "real_name")
    private String realName;

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
     * 银行预留手机号
     */
    @JSONField(name = "bank_cell_phone")
    private String bankCellPhone;

    /**
     * 所属银行编码
     */
    @JSONField(name = "bank_code")
    private String bankCode;

    /**
     * 大小额联行号
     */
    @JSONField(name = "unionpay_code")
    private String unionpayCode;

    /**
     * 门店名称
     */
    @JSONField(name = "store_name")
    private String storeName;

    /**
     * 门店电话
     */
    @JSONField(name = "store_phone")
    private String storePhone;

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
     * 门店地址经度
     */
    @JSONField(name = "longitude")
    private String longitude;

    /**
     * 门店地址纬度
     */
    @JSONField(name = "latitude")
    private String latitude;

    /**
     * 门店经营许可类型
     * 1: 营业执照
     * 2: 证明函
     */
    @JSONField(name = "license_type")
    private Integer licenseType;

    /**
     * 营业执照/证明函照片地址
     */
    @JSONField(name = "license_photo")
    private String licensePhoto;

    /**
     * 手持身份证照片
     */
    @JSONField(name = "hand_hold_id_card_pic")
    private String handHoldIdCardPic;

    /**
     * 营业执照名称
     */
    @JSONField(name = "license_name")
    private String licenseName;

    /**
     * 营业执照号
     */
    @JSONField(name = "license_id")
    private String licenseId;

    /**
     * 营业执照有效期类型
     */
    @JSONField(name = "license_time_type")
    private Integer licenseTimeType;

    /**
     * 营业执照有效期开始时间
     */
    @JSONField(name = "license_time_begin")
    private String licenseTimeBegin;

    /**
     * 营业执照有效期开始时间
     */
    @JSONField(name = "license_time_end")
    private String licenseTimeEnd;

    /**
     * 经营许可证图片地址
     */
    @JSONField(name = "operating_license_photo")
    private String operatingLicensePhoto;

    /**
     * 门头照片
     */
    @JSONField(name = "store_front_img_url")
    private String storeFrontImgUrl;

    /**
     * 门店店内环境照片
     */
    @JSONField(name = "store_env_photo")
    private String storeEnvPhoto;

    /**
     * 门店收银台照片
     */
    @JSONField(name = "store_cash_photo")
    private String storeCashPhoto;

    /**
     * 其他照片
     */
    @JSONField(name = "other_photo")
    private String otherPhoto;

    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;

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

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
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

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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

    public String getBankCellPhone() {
        return bankCellPhone;
    }

    public void setBankCellPhone(String bankCellPhone) {
        this.bankCellPhone = bankCellPhone;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getUnionpayCode() {
        return unionpayCode;
    }

    public void setUnionpayCode(String unionpayCode) {
        this.unionpayCode = unionpayCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicensePhoto() {
        return licensePhoto;
    }

    public void setLicensePhoto(String licensePhoto) {
        this.licensePhoto = licensePhoto;
    }

    public String getHandHoldIdCardPic() {
        return handHoldIdCardPic;
    }

    public void setHandHoldIdCardPic(String handHoldIdCardPic) {
        this.handHoldIdCardPic = handHoldIdCardPic;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Integer getLicenseTimeType() {
        return licenseTimeType;
    }

    public void setLicenseTimeType(Integer licenseTimeType) {
        this.licenseTimeType = licenseTimeType;
    }

    public String getLicenseTimeBegin() {
        return licenseTimeBegin;
    }

    public void setLicenseTimeBegin(String licenseTimeBegin) {
        this.licenseTimeBegin = licenseTimeBegin;
    }

    public String getLicenseTimeEnd() {
        return licenseTimeEnd;
    }

    public void setLicenseTimeEnd(String licenseTimeEnd) {
        this.licenseTimeEnd = licenseTimeEnd;
    }

    public String getOperatingLicensePhoto() {
        return operatingLicensePhoto;
    }

    public void setOperatingLicensePhoto(String operatingLicensePhoto) {
        this.operatingLicensePhoto = operatingLicensePhoto;
    }

    public String getStoreFrontImgUrl() {
        return storeFrontImgUrl;
    }

    public void setStoreFrontImgUrl(String storeFrontImgUrl) {
        this.storeFrontImgUrl = storeFrontImgUrl;
    }

    public String getStoreEnvPhoto() {
        return storeEnvPhoto;
    }

    public void setStoreEnvPhoto(String storeEnvPhoto) {
        this.storeEnvPhoto = storeEnvPhoto;
    }

    public String getStoreCashPhoto() {
        return storeCashPhoto;
    }

    public void setStoreCashPhoto(String storeCashPhoto) {
        this.storeCashPhoto = storeCashPhoto;
    }

    public String getOtherPhoto() {
        return otherPhoto;
    }

    public void setOtherPhoto(String otherPhoto) {
        this.otherPhoto = otherPhoto;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}
