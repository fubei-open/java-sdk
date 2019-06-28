package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店信息修改返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id CateStoreInfoModel.java, v1.0 2019-06-28 15:44 John Exp$
 */
@SuppressWarnings("unused")
public class CateStoreInfoModel implements BaseModel {
    /**
     * 门店id
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店状态
     */
    @JSONField(name = "store_status")
    private Integer storeStatus;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }
}
