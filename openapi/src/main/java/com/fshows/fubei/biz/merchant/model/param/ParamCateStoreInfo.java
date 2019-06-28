package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 修改门店信息
 * 传参表示修改，不传参表示不修改，将使用原来的值
 * merchantId、storeId必填
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamCateStoreInfo.java, v1.0 2019-06-28 15:36 John Exp$
 */
@SuppressWarnings("unused")
public class ParamCateStoreInfo extends BaseBizContentModel {
    /**
     * 商户id
     */
    @JSONField(name = "merchant_id")
    private Integer merchantId;

    /**
     * 门店id
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店名称
     */
    @JSONField(name = "store_name")
    private String storeName;

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
     * 门店电话
     */
    @JSONField(name = "store_phone")
    private String storePhone;

    /**
     * 品类id
     */
    @JSONField(name = "unity_category_id")
    private Integer unityCategoryId;

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
     * 门店经营许可类型
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
     * 品牌名称
     */
    @JSONField(name = "brand_name")
    private String brandName;

    /**
     * 经营许可证图片地址
     */
    @JSONField(name = "operating_license_photo")
    private String operatingLicensePhoto;

    /**
     * 其他照片
     */
    @JSONField(name = "other_pic1")
    private String otherPic1;

    /**
     * 备注
     */
    @JSONField(name = "remark")
    private String remark;

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public Integer getUnityCategoryId() {
        return unityCategoryId;
    }

    public void setUnityCategoryId(Integer unityCategoryId) {
        this.unityCategoryId = unityCategoryId;
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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getOperatingLicensePhoto() {
        return operatingLicensePhoto;
    }

    public void setOperatingLicensePhoto(String operatingLicensePhoto) {
        this.operatingLicensePhoto = operatingLicensePhoto;
    }

    public String getOtherPic1() {
        return otherPic1;
    }

    public void setOtherPic1(String otherPic1) {
        this.otherPic1 = otherPic1;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
