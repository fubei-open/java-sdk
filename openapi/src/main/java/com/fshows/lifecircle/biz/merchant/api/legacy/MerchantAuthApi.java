package com.fshows.lifecircle.biz.merchant.api.legacy;

import com.fshows.lifecircle.biz.merchant.model.entity.AuthPublicMinaModel;
import com.fshows.lifecircle.biz.merchant.model.entity.AuthWechatOfficialAccountsModel;
import com.fshows.lifecircle.biz.merchant.model.param.ParamMinaPublicAuth;
import com.fshows.lifecircle.biz.merchant.model.param.ParamPaymentAuth;
import com.fshows.lifecircle.foundation.annotation.LifecycleApi;
import com.fshows.lifecircle.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 微信授权接口
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantAuthApi.java, v1.0 2019-06-10 23:39 John Exp$
 */
@SuppressWarnings("unused")
public interface MerchantAuthApi {
    /**
     * 微信网页授权接口
     * 文档地址：http://docs.51fubei.com/open-api/business/methods/auth.html
     *
     * @param param 参数
     * @return 返回实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @LifecycleApi(method = "openapi.payment.auth.auth")
    Call<AuthWechatOfficialAccountsModel> wechatOfficialAccountAuth(@Body ParamPaymentAuth param);

    /**
     * 微信小程序授权接口
     * 文档地址：http://docs.51fubei.com/open-api/business/methods/minaAuth.html
     *
     * @param param 参数
     * @return 返回实体
     */
    Call<AuthPublicMinaModel> minaPublicAuth(@Body ParamMinaPublicAuth param);
}
