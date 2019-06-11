package com.fshows.lifecircle.foundation.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.constants.OpenApiConstants;

/**
 * 请求参数对象
 * http://docs.51fubei.com/open-api/business/parameter.html
 *
 * @author John (linwei@fshows.com)
 * @version $Id AbsRequestModel.java, v1.0 2019-06-06 00:02 John Exp$
 */
@SuppressWarnings("unused")
public class RequestParam implements BaseModel {

    private RequestParam(BaseBizContentModel bizContent) {
        this.bizContent = bizContent.toJson();
    }

    /**
     * 根据业务数据创建请求参数
     * @param bizContent 业务参数
     * @param <T> BaseBizContentModel
     * @return 请求参数对象
     */
    public static <T extends BaseBizContentModel>RequestParam create(T bizContent) {
        return new RequestParam(bizContent);
    }

    /**
     * 付呗平台分配的API接口ID（商户开放平台ID）
     */
    @JSONField(name = "app_id")
    private String appId = "";

    /**
     * 接口名称
     */
    @JSONField(name = "method")
    private String method = "";

    /**
     * 接口格式,默认json
     */
    @JSONField(name = "format")
    private String format = OpenApiConstants.DATA_FORMAT_JSON;

    /**
     * 签名算法,默认md5
     */
    @JSONField(name = "sign_method")
    private String signMethod = OpenApiConstants.HASH_METHOD_MD5;

    /**
     * 签名
     */
    @JSONField(name = "sign")
    private String sign = "";

    /**
     * 请求端随机生成数
     */
    @JSONField(name = "nonce")
    private String nonce = "";

    /**
     * 接口版本,默认1.0
     */
    @JSONField(name = "version")
    private String version = OpenApiConstants.API_VERSION_1_0;

    /**
     * 业务数据
     */
    @JSONField(name = "biz_content")
    private String bizContent;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBizContent() {
        return bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }
}
