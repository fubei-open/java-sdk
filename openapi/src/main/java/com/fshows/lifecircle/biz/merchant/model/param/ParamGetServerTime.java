package com.fshows.lifecircle.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 获得服务器时间
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamGetServerTime.java, v1.0 2019-06-11 15:26 John Exp$
 */
@SuppressWarnings("unused")
public class ParamGetServerTime extends BaseBizContentModel {
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
