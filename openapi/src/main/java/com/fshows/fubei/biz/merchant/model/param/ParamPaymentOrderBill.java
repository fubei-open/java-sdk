package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 交易查询接口，返回
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentOrderBill.java, v1.0 2019-06-11 13:13 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentOrderBill extends BaseBizContentModel {

    /**
     * 查询开始时间：2018-08-01 00:00:00
     */
    @JSONField(name = "start_time")
    private String startTime;

    /**
     * 查询结束时间：2018-08-01 23:59:59
     */
    @JSONField(name = "end_time")
    private String endTime;

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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
}
