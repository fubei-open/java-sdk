package com.fshows.fubei.biz.agent.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 获得图片Url
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamGetImageUrl.java, v1.0 2019-06-28 14:30 John Exp$
 */
@SuppressWarnings("unused")
public class ParamGetImageUrl extends BaseBizContentModel {
    /**
     * 上传图片接口返回的key
     */
    @JSONField(name = "key")
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
