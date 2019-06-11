package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;
import java.util.List;

/**
 * 交易查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentBillOrderModel.java, v1.0 2019-06-11 13:30 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentBillOrderModel implements BaseModel {

    /**
     * 交易笔数汇总
     */
    @JSONField(name = "summary_num")
    private Integer summaryNum;

    /**
     * 交易收入汇总
     */
    @JSONField(name = "summary_total_fee")
    private BigDecimal summaryTotalFee;

    /**
     * 退款笔数汇总
     */
    @JSONField(name = "refund_num")
    private Integer refundNum;

    /**
     * 退款金额汇总
     */
    @JSONField(name = "refund_money")
    private BigDecimal refundMoney;

    /**
     * 订单数据
     */
    @JSONField(name = "list")
    private List<PaymentBillOrderDataItemModel> list;

    public Integer getSummaryNum() {
        return summaryNum;
    }

    public void setSummaryNum(Integer summaryNum) {
        this.summaryNum = summaryNum;
    }

    public BigDecimal getSummaryTotalFee() {
        return summaryTotalFee;
    }

    public void setSummaryTotalFee(BigDecimal summaryTotalFee) {
        this.summaryTotalFee = summaryTotalFee;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public List<PaymentBillOrderDataItemModel> getList() {
        return list;
    }

    public void setList(List<PaymentBillOrderDataItemModel> list) {
        this.list = list;
    }
}
