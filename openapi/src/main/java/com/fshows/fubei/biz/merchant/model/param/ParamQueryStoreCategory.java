package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 门店类目请求参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamQueryStoreCategory.java, v1.0 2019-06-08 00:26 John Exp$
 */
@SuppressWarnings("unused")
public class ParamQueryStoreCategory extends BaseBizContentModel {
    /**
     * 门店类目父类ID，默认为0
     */
    @JSONField(name = "parent_id")
    private Integer parentId = 0;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
