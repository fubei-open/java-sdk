package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.annimon.stream.Optional;
import com.annimon.stream.function.Supplier;
import com.annimon.stream.function.ThrowableSupplier;
import com.fshows.fubei.foundation.model.BaseModel;
import com.google.common.base.Splitter;

/**
 * 获得图像Model
 *
 * @author John (linwei@fshows.com)
 * @version $Id GetImageModel.java, v1.0 2019-06-28 14:40 John Exp$
 */
@SuppressWarnings("unused")
public class GetImageModel implements BaseModel {
    /**
     * 图片存储url
     */
    @JSONField(name = "upload_url")
    private String uploadUrl;

    /**
     * 阿里云oss站点信息
     */
    @JSONField(name = "endpoint")
    private String endpoint;

    public String getUploadUrl() {
        if (uploadUrl == null) {
            return null;
        }
        return Supplier.Util.safe(new ThrowableSupplier<String, Throwable>() {
            @Override
            public String get() {
                return Splitter.on("?").split(uploadUrl).iterator().next();
            }
        }, uploadUrl).get();
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
