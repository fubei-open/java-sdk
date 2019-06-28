package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店信息Model
 *
 * @author John (linwei@fshows.com)
 * @version $Id StoreInfoModel.java, v1.0 2019-06-28 16:49 John Exp$
 */
@SuppressWarnings("unused")
public class StoreInfoModel implements BaseModel {

    /**
     * 门店名称
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店名称
     */
    @JSONField(name = "store_name")
    private String storeName;

    /**
     * 门店状态
     */
    @JSONField(name = "store_status")
    private Integer storeStatus;

    /**
     * 门店电话
     */
    @JSONField(name = "store_phone")
    private String storePhone;

    /**
     * 省份编码
     */
    @JSONField(name = "store_province_code")
    private String storeProvinceCode;

    /**
     * 城市编码
     */
    @JSONField(name = "store_city_code")
    private String storeCityCode;

    /**
     * 区域编码
     */
    @JSONField(name = "store_area_code")
    private String storeAreaCode;

    /**
     * 门店地址
     */
    @JSONField(name = "address")
    private String address;

    /**
     * 门店详细地址
     */
    @JSONField(name = "store_street_address")
    private String storeStreetAddress;

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

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreProvinceCode() {
        return storeProvinceCode;
    }

    public void setStoreProvinceCode(String storeProvinceCode) {
        this.storeProvinceCode = storeProvinceCode;
    }

    public String getStoreCityCode() {
        return storeCityCode;
    }

    public void setStoreCityCode(String storeCityCode) {
        this.storeCityCode = storeCityCode;
    }

    public String getStoreAreaCode() {
        return storeAreaCode;
    }

    public void setStoreAreaCode(String storeAreaCode) {
        this.storeAreaCode = storeAreaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStoreStreetAddress() {
        return storeStreetAddress;
    }

    public void setStoreStreetAddress(String storeStreetAddress) {
        this.storeStreetAddress = storeStreetAddress;
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
}
