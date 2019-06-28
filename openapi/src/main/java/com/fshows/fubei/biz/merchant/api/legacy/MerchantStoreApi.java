package com.fshows.fubei.biz.merchant.api.legacy;

import com.fshows.fubei.biz.merchant.model.entity.CateStoreInfoModel;
import com.fshows.fubei.biz.merchant.model.entity.CreateOrUpdateStoreModel;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
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
     * @deprecated 已过时，请使用{{@link #updateStoreInfo(ParamCateStoreInfo)}代替}
     * @param param 参数
     * @return 响应实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.store.update")
    @Deprecated
    Call<CreateOrUpdateStoreModel> updateStore(@Body ParamStoreUpdate param);

    /**
     * 门店信息修改
     * @param param 参数
     * @return 门店响应参数
     */
    @POST(OpenApiConstants.GATEWAY_CATE)
    @FubeiOpenApi(method = "openapi.cate.store.info")
    Call<CateStoreInfoModel> updateStoreInfo(@Body ParamCateStoreInfo param);

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
