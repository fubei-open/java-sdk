package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 服务器时
 *
 * @author John (linwei@fshows.com)
 * @version $Id ServerTimeModel.java, v1.0 2019-06-11 15:29 John Exp$
 */
@SuppressWarnings("unused")
public class ServerTimeModel implements BaseModel {
    /**
     * 服务器时间
     */
    @JSONField(name = "time")
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
