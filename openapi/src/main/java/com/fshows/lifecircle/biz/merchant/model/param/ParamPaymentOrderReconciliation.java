package com.fshows.lifecircle.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.lifecircle.foundation.model.BaseBizContentModel;

/**
 * 对账单查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderReconciliation.java, v1.0 2019-06-11 00:08 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderReconciliation extends BaseBizContentModel {
    /**
     * 年 (订单创建时间)
     */
    @JSONField(name = "year")
    private Integer year;

    /**
     * 月
     */
    @JSONField(name = "month")
    private Integer month;

    /**
     * 日
     */
    @JSONField(name = "day")
    private Integer day;

    /**
     * 门店ID
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    /**
     * 收银员ID
     */
    @JSONField(name = "cashier_id")
    private Integer cashierId;

    /**
     * 默认第一页
     */
    @JSONField(name = "page")
    private Integer page;

    /**
     * 每页数量 默认10条 最大100
     */
    @JSONField(name = "limit")
    private Integer limit;

    /**
     * 是否返回全部交易数据 "1"表示返回 其他字符或不上传表示不返回
     */
    @JSONField(name = "type")
    private String type;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getCashierId() {
        return cashierId;
    }

    public void setCashierId(Integer cashierId) {
        this.cashierId = cashierId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
