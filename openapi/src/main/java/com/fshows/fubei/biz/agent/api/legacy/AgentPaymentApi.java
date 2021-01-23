package com.fshows.fubei.biz.agent.api.legacy;

import com.fshows.fubei.biz.agent.model.entity.OrderCreateModel;
import com.fshows.fubei.biz.agent.model.entity.OrderPayModel;
import com.fshows.fubei.biz.agent.model.param.ParamOrderCreate;
import com.fshows.fubei.biz.agent.model.param.ParamOrderPay;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AgentPaymentApi {
    /**
     * 付款码支付
     * 文档地址：http://docs.51fubei.com/agent-api/payment/orderPay.html
     *
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "fbpay.order.pay")
    Call<OrderPayModel> orderPay(@Body ParamOrderPay param);

    /**
     * 统一下单
     * 文档地址：http://docs.51fubei.com/agent-api/payment/orderCreate.html
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "fbpay.order.create")
    Call<OrderCreateModel> orderCreate(@Body ParamOrderCreate param);
}
