package com.fshows.fubei.biz.merchant.api.legacy;

import com.fshows.fubei.biz.agent.model.entity.pay.OrderCreateModel;
import com.fshows.fubei.biz.agent.model.entity.pay.OrderPayModel;
import com.fshows.fubei.biz.agent.model.entity.pay.OrderQrcodeModel;
import com.fshows.fubei.biz.agent.model.param.pay.ParamCreatePay;
import com.fshows.fubei.biz.agent.model.param.pay.ParamOrderPay;
import com.fshows.fubei.biz.agent.model.param.pay.ParamOrderQrcode;
import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.biz.merchant.model.entity.CateStoreInfoModel;
import com.fshows.fubei.biz.merchant.model.param.ParamCateStoreInfo;
import com.fshows.fubei.biz.merchant.model.param.ParamPaymentCashierQuery;
import com.fshows.fubei.biz.merchant.model.param.ParamPaymentQueryStore;
import com.fshows.fubei.biz.merchant.model.param.ParamQueryStoreCategory;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.enums.OpenApiType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 门店接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantStoreApi.java, v1.0 2019-06-06 20:04 John Exp$
 */
@SuppressWarnings("unused")
public interface MerchantStoreApi {
    /**
     * 门店类目
     * http://docs.51fubei.com/open-api/business/methods/storeCategory.html
     * @param param 参数
     * @return 响应实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.store.category")
    Call<BizResult.StoreCategory> queryStoreCategory(@Body ParamQueryStoreCategory param);

    /**
     * 门店ID查询接口
     * 文档地址：http://docs.51fubei.com/open-api/business/methods/getStoreID.html
     * @param param 参数
     * @return 响应实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.store.query")
    Call<BizResult.StoreQuery> queryStore(@Body ParamPaymentQueryStore param);

    /**
     * 收银员ID查询接口
     * http://docs.51fubei.com/open-api/business/methods/getCashierID.html
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.cashier.query")
    Call<BizResult.PaymentCashierQuery> cashierQuery(@Body ParamPaymentCashierQuery param);

    /**
     * 门店创建
     * 备注：该接口同时支持商户级和代理商级调用
     * 代理商级调用：需要vendor_sn和vendor_secret
     * 商户级调用：需要app_id和app_secret
     * http://docs.51fubei.com/agent-api/newmethods/storeInfoModify.html
     * @param param 参数
     * @return 门店响应参数
     */
    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "openapi.cate.store.info.create", openApiType = OpenApiType.MERCHANT)
    Call<CateStoreInfoModel> createStoreInfo(@Body ParamCateStoreInfo param);

    /**
     * 门店信息修改
     * 备注：该接口同时支持商户级和代理商级调用
     * 代理商级调用：需要vendor_sn和vendor_secret
     * 商户级调用：需要app_id和app_secret
     * http://docs.51fubei.com/agent-api/newmethods/storeInfoModify.html
     * @param param 参数
     * @return 门店响应参数
     */
    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "openapi.cate.store.info.update", openApiType = OpenApiType.MERCHANT)
    Call<CateStoreInfoModel> updateStoreInfo(@Body ParamCateStoreInfo param);

    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "fbpay.order.pay", openApiType = OpenApiType.MERCHANT)
    Call<OrderPayModel> orderPay(@Body ParamOrderPay param);

    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "fbpay.order.create", openApiType = OpenApiType.MERCHANT)
    Call<OrderCreateModel> orderCreate(@Body ParamCreatePay param);

    /**
     * 定额码支付
     * @param param
     * @return
     */
    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "fbpay.order.qrcode", openApiType = OpenApiType.MERCHANT)
    Call<OrderQrcodeModel> orderQrcode(@Body ParamOrderQrcode param);
}
