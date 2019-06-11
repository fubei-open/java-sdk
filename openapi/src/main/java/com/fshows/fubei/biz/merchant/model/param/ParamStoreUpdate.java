package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

import java.math.BigDecimal;

/**
 * 门店修改
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamStoreUpdate.java, v1.0 2019-06-11 10:06 John Exp$
 */
public class ParamStoreUpdate extends BaseBizContentModel {

    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店名称
     */
    @JSONField(name = "store_name")
    private String storeName;

    /**
     * 门店类目
     */
    @JSONField(name = "category_id")
    private Integer categoryId;

    /**
     * 门店所在省份
     */
    @JSONField(name = "province")
    private String province;

    /**
     * 门店所在城市
     */
    @JSONField(name = "city")
    private String city;

    /**
     * 门店所在县区
     */
    @JSONField(name = "county")
    private String county;

    /**
     * 门店的详细地址
     */
    @JSONField(name = "store_area")
    private String storeArea;

    /**
     * 门店所在纬度
     */
    @JSONField(name = "store_lng")
    private BigDecimal storeLng;

    /**
     * 门店所在经度
     */
    @JSONField(name = "store_lat")
    private BigDecimal storeLat;

    /**
     * 门店号码（11位手机号或者座机号）
     */
    @JSONField(name = "contact")
    private String contact;

    /**
     * 人均消费
     */
    @JSONField(name = "avg_price")
    private Integer avgPrice;

    /**
     * 营业执照
     */
    @JSONField(name = "business_license_img_url")
    private String businessLicenseImgUrl;

    /**
     * 门店图片
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
     * 证件类型
     */
    @JSONField(name = "id_type")
    private Integer idType;

    /**
     * 营业执照号
     */
    @JSONField(name = "business_license_id")
    private String businessLicenseId;

    /**
     * 营业执照有效期（0：正常有效期1：长期有效）
     */
    @JSONField(name = "business_license_time_type")
    private Integer businessLicenseTimeType;

    /**
     * 营业执照有效期开始时间
     */
    @JSONField(name = "business_license_time_begin")
    private String businessLicenseTimeBegin;

    /**
     * 营业执照有效期结束时间
     */
    @JSONField(name = "business_license_time_end")
    private String businessLicenseTimeEnd;

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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    public BigDecimal getStoreLng() {
        return storeLng;
    }

    public void setStoreLng(BigDecimal storeLng) {
        this.storeLng = storeLng;
    }

    public BigDecimal getStoreLat() {
        return storeLat;
    }

    public void setStoreLat(BigDecimal storeLat) {
        this.storeLat = storeLat;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getBusinessLicenseImgUrl() {
        return businessLicenseImgUrl;
    }

    public void setBusinessLicenseImgUrl(String businessLicenseImgUrl) {
        this.businessLicenseImgUrl = businessLicenseImgUrl;
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

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getBusinessLicenseId() {
        return businessLicenseId;
    }

    public void setBusinessLicenseId(String businessLicenseId) {
        this.businessLicenseId = businessLicenseId;
    }

    public Integer getBusinessLicenseTimeType() {
        return businessLicenseTimeType;
    }

    public void setBusinessLicenseTimeType(Integer businessLicenseTimeType) {
        this.businessLicenseTimeType = businessLicenseTimeType;
    }

    public String getBusinessLicenseTimeBegin() {
        return businessLicenseTimeBegin;
    }

    public void setBusinessLicenseTimeBegin(String businessLicenseTimeBegin) {
        this.businessLicenseTimeBegin = businessLicenseTimeBegin;
    }

    public String getBusinessLicenseTimeEnd() {
        return businessLicenseTimeEnd;
    }

    public void setBusinessLicenseTimeEnd(String businessLicenseTimeEnd) {
        this.businessLicenseTimeEnd = businessLicenseTimeEnd;
    }
}
