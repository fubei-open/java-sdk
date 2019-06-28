package com.fshows.fubei.foundation.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 业务参数Model的基类
 *
 * @author John (linwei@fshows.com)
 * @version $Id BaseBizContentModel.java, v1.0 2019-06-06 00:02 John Exp$
 */
@SuppressWarnings("WeakerAccess")
public class BaseBizContentModel implements BaseModel {

    public String toJson() {
        return JSON.toJSONString(this, SerializerFeature.WriteEnumUsingToString);
    }
}
