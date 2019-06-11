package com.fshows.lifecircle.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseModel;

/**
 * 门店ID查询
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentStoreQueryModel.java, v1.0 2019-06-07 00:35 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentStoreQueryModel implements BaseModel {
    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 门店名称
     */
    @JSONField(name = "store_name")
    private String storeName;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
