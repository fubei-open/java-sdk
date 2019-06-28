package com.fshows.fubei.biz.agent.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店状态
 *
 * @author John (linwei@fshows.com)
 * @version $Id StoreStatusModel.java, v1.0 2019-06-28 16:11 John Exp$
 */
@SuppressWarnings("unused")
public class StoreStatusModel implements BaseModel {

    /**
     * 门店名称
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店状态
     */
    @JSONField(name = "store_status")
    private Integer storeStatus;

    /**
     * 门店错误信息
     */
    @JSONField(name = "store_error_msg")
    private String storeErrorMsg;

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

    public String getStoreErrorMsg() {
        return storeErrorMsg;
    }

    public void setStoreErrorMsg(String storeErrorMsg) {
        this.storeErrorMsg = storeErrorMsg;
    }
}
