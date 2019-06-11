package com.fshows.fubei.biz.merchant.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.util.List;

/**
 * List包装Model
 * 为了适配开放平台1.0
 * { data: list: [] } 的数据结构
 *
 * @author John (linwei@fshows.com)
 * @version $Id ListWrappedModel.java, v1.0 2019-06-07 17:51 John Exp$
 */
@SuppressWarnings("unused")
public class ListWrappedModel<T extends BaseModel> {
    /**
     * 列表数据
     */
    @JSONField(name = "list")
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
