package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 门店ID查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentQueryStore.java, v1.0 2019-06-06 20:06 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentQueryStore extends BaseBizContentModel {
    /**
     * 门店名称，可选
     */
    @JSONField(name = "store_name")
    private String storeName;

    /**
     * 门店ID，可选
     */
    @JSONField(name = "storeId")
    private Integer storeId;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
