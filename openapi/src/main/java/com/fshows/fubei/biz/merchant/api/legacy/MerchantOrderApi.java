package com.fshows.fubei.biz.merchant.api.legacy;

import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.biz.merchant.model.entity.*;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 订单列表接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantOrderApi.java, v1.0 2019-06-05 23:57 John Exp$
 */
@SuppressWarnings("unused")
public interface MerchantOrderApi {
    /**
     * 订单查询接口
     * http://docs.51fubei.com/open-api/business/methods/query.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.query")
    Call<PaymentQueryOrderModel> orderQuery(@Body ParamPaymentOrderQuery param);

    /**
     * 对账单查询接口
     * http://docs.51fubei.com/open-api/business/methods/orderReconciliation.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.reconciliation")
    Call<BizResult.PaymentOrderReconciliation> orderReconciliation(@Body ParamPaymentOrderReconciliation param);

    /**
     * 退款接口
     * 特别说明: 目前退款接口只支持90日内成功支付的退款，支持部分退款，单笔订单退款次数不可超过10次
     * http://docs.51fubei.com/open-api/business/methods/refund.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.refund")
    Call<PaymentRefundOrderModel> orderRefund(@Body ParamPaymentOrderRefund param);

    /**
     * 退款查询接口
     * http://docs.51fubei.com/open-api/business/methods/refundQuery.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.refund.query")
    Call<PaymentQueryRefundOrderModel> orderRefundQuery(@Body ParamPaymentOrderRefundQuery param);

    /**
     * 订单剩余可退款查询接口
     * http://docs.51fubei.com/open-api/business/methods/LimitRefundMoney.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.refund.statistics")
    Call<PaymentRefundStatisticsModel> refundStatistics(@Body ParamPaymentRefundStatistics param);

    /**
     * 订单撤销接口（仅支持刷卡支付订单撤销）
     * 当支付交易返回失败或支付系统超时，调用该接口撤销交易。如果此订单用户支付失败，系统会将此订单关闭；如果用户支付成功，系统会将此订单资金退还给用户。
     * http://docs.51fubei.com/open-api/business/methods/orderReverse.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.reverse")
    Call<PaymentReverseOrderModel> orderReverse(@Body ParamPaymentOrderReverse param);

    /**
     * 交易查询接口
     * http://docs.51fubei.com/open-api/business/methods/ma-ya-dui-zhang-dan-cha-xun-jie-kou.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.bill")
    Call<PaymentBillOrderModel> orderBill(@Body ParamPaymentOrderBill param);

    /**
     * 订单关闭接口（支持扫码支付接口，微信公众号支付订单）
     * 文档地址：http://docs.51fubei.com/open-api/business/methods/orderClose.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.close")
    Call<PaymentCloseOrderModel> orderClose(@Body ParamPaymentOrderClose param);
}
