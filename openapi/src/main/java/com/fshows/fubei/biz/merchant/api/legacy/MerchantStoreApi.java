package com.fshows.fubei.biz.merchant.api.legacy;

import com.fshows.fubei.biz.merchant.model.entity.CreateOrUpdateStoreModel;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 订单门店接口
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
     * 门店创建
     * http://docs.51fubei.com/open-api/business/methods/storeCreate.html
     *
     * @param param 参数
     * @return 响应实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.store.create")
    Call<CreateOrUpdateStoreModel> createStore(@Body ParamStoreCreate param);

    /**
     * 门店修改
     * http://docs.51fubei.com/open-api/business/methods/men-dian-xiu-gai-jie-kou.html
     *
     * @param param 参数
     * @return 响应实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.store.update")
    Call<CreateOrUpdateStoreModel> updateStore(@Body ParamStoreUpdate param);

    /**
     * 收银员ID查询接口
     * http://docs.51fubei.com/open-api/business/methods/getCashierID.html
     * @param param 参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.cashier.query")
    Call<BizResult.PaymentCashierQuery> cashierQuery(@Body ParamPaymentCashierQuery param);
}
