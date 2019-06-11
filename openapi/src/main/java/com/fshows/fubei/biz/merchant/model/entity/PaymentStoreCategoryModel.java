package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

/**
 * 门店类目
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentStoreCategoryModel.java, v1.0 2019-06-06 23:18 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentStoreCategoryModel implements BaseModel {
    /**
     * 类目ID（作为下级类目的parent_id）
     */
    @JSONField(name = "category_id")
    private Integer categoryId;

    /**
     * 类目的名称
     */
    @JSONField(name = "category_name")
    private String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
