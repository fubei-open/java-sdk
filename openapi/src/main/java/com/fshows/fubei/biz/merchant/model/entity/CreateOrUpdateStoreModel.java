package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店创建/修改返回参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id CreateOrUpdateStoreModel.java, v1.0 2019-06-11 10:01 John Exp$
 */
@SuppressWarnings("unused")
public class CreateOrUpdateStoreModel implements BaseModel {
    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
