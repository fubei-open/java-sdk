package com.fshows.lifecircle.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 收银员ID查询接口参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentCashierQuery.java, v1.0 2019-06-11 00:48 John Exp$
 */
public class ParamPaymentCashierQuery extends BaseBizContentModel {
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
