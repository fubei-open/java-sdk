package com.fshows.lifecircle.biz.merchant.api.legacy;

import com.fshows.lifecircle.biz.merchant.model.entity.ServerTimeModel;
import com.fshows.lifecircle.foundation.annotation.LifecycleApi;
import com.fshows.lifecircle.foundation.constants.OpenApiConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 支付类目API
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantCommonApi.java, v1.0 2019-06-10 22:39 John Exp$
 */
@SuppressWarnings("unused")
public interface MerchantCommonApi {
    /**
     * 获得服务器时间
     * http://docs.51fubei.com/open-api/business/methods/huo-qu-fu-wu-qi-shi-jian-jie-kou.html
     *
     * @param param param可传任意参数
     * @return 返回结果实体
     */
    @POST(OpenApiConstants.GATEWAY)
    @LifecycleApi(method = "openapi.get.time")
    Call<ServerTimeModel> getServerTime(@Body Object param);
}
