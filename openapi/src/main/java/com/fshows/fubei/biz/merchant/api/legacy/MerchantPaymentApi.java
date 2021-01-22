package com.fshows.fubei.biz.merchant.api.legacy;

import com.fshows.fubei.biz.merchant.model.entity.*;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 支付接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantPaymentApi.java, v1.0 2019-06-11 18:02 John Exp$
 */
@SuppressWarnings("unused")
public interface MerchantPaymentApi {
    /**
     * 刷卡支付接口
     * 文档地址：http://docs.51fubei.com/open-api/business/methods/swipe.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.swipe")
    Call<PaymentSwipeOrderModel> orderSwipe(@Body ParamPaymentOrderSwipe param);


    /**
     * 扫码支付接口
     * http://docs.51fubei.com/open-api/business/methods/scan.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.scan")
    Call<PaymentScanOrderModel> orderScan(@Body ParamPaymentOrderScan param);

    /**
     * 微信公众号支付接口
     * http://docs.51fubei.com/open-api/business/methods/H5Pay.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.h5pay")
    Call<PaymentH5PayOrderModel> orderH5Pay(@Body ParamPaymentOrderH5Pay param);


    /**
     * 微信小程序支付接口
     * 调起小程序支付需要在“微信公众平台|小程序”—设置—配置request合法域名
     * http://docs.51fubei.com/open-api/business/methods/minaPay.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.mina")
    Call<PaymentMinaOrderModel> orderMina(@Body ParamPaymentOrderMina param);

    /**
     * 支付宝统一下单接口
     * http://docs.51fubei.com/open-api/business/methods/alipayH5.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.Alipay.H5")
    Call<PaymentH5AlipayModel> orderAlipay(@Body ParamPaymentAlipayH5 param);
}
