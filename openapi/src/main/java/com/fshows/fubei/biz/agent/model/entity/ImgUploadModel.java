package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 上传图片返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id ImgUploadModel.java, v1.0 2019-06-28 13:21 John Exp$
 */
@SuppressWarnings("unused")
public class ImgUploadModel implements BaseModel {

    /**
     * 图片存储url
     */
    @JSONField(name = "file_url")
    private String fileUrl;

    /**
     * 用于调用查询图片url接口的key
     */
    @JSONField(name = "key")
    private String key;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
