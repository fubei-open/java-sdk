package com.fshows.fubei.biz.merchant.model.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseModel;

import java.math.BigDecimal;

/**
 * 订单剩余可退款查询接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id PaymentRefundStatisticsModel.java, v1.0 2019-06-11 09:56 John Exp$
 */
@SuppressWarnings("unused")
public class PaymentRefundStatisticsModel implements BaseModel {

    /**
     * 付呗订单号
     */
    @JSONField(name = "order_sn")
    private String orderSn;

    /**
     * 交易总额
     */
    @JSONField(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 已退款次数
     */
    @JSONField(name = "refund_num")
    private Integer refundNum;

    /**
     * 剩余可退款金额
     */
    @JSONField(name = "can_refund")
    private BigDecimal canRefund;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public BigDecimal getCanRefund() {
        return canRefund;
    }

    public void setCanRefund(BigDecimal canRefund) {
        this.canRefund = canRefund;
    }
}
