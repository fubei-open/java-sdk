package com.fshows.fubei.biz.agent.api.legacy;

import com.fshows.fubei.biz.agent.model.BizResult;
import com.fshows.fubei.biz.agent.model.entity.*;
import com.fshows.fubei.biz.agent.model.param.*;
import com.fshows.fubei.biz.merchant.model.entity.CateStoreInfoModel;
import com.fshows.fubei.biz.merchant.model.param.ParamCateStoreInfo;
import com.fshows.fubei.foundation.annotation.FubeiOpenApi;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.enums.OpenApiType;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * 代理商Api
 *
 * @author John (linwei@fshows.com)
 * @version $Id AgentApi.java, v1.0 2019-06-28 10:37 John Exp$
 */
@SuppressWarnings("unused")
public interface AgentApi {
    /**
     * 开户银行查询
     * 文档地址：http://docs.51fubei.com/agent-api/newmethods/banks.html
     * @param param 请求参数
     * @return 开户银行信息
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.base.banks", openApiType = OpenApiType.AGENT)
    Call<BankModel> queryBanks(@Body ParamBanks param);

    /**
     * 支行列表查询
     * 文档地址：http://docs.51fubei.com/agent-api/newmethods/branches.html
     * @param param 请求参数
     * @return 支行列表
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.base.branches", openApiType = OpenApiType.AGENT)
    Call<BizResult.BankBranches> queryBankBranches(@Body ParamBankBranches param);

    /**
     * 上传图片
     * 文档地址：http://docs.51fubei.com/agent-api/newmethods/imgUpload.html
     * @param param 请求参数
     * @return 支行列表
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.base.imgupload", openApiType = OpenApiType.AGENT)
    Call<ImgUploadModel> imageUpload(@Body ParamImgUpload param);

    /**
     * 查询图片URL
     * 文档地址：http://docs.51fubei.com/agent-api/newmethods/branches.html
     * @param param 请求参数
     * @return 支行列表
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.base.getimgurl", openApiType = OpenApiType.AGENT)
    Call<GetImageModel> getImageUrl(@Body ParamGetImageUrl param);


    /**
     * 门店信息修改
     * 备注：该参数为商户级参数，依赖AppId和AppSecret
     * http://docs.51fubei.com/agent-api/newmethods/storeInfoModify.html
     * @param param 参数
     * @return 门店响应参数
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.cate.store.info", openApiType = OpenApiType.AGENT)
    Call<CateStoreInfoModel> updateStoreInfo(@Body ParamCateStoreInfo param);


    /**
     * 查询商户门店基本信息
     * http://docs.51fubei.com/agent-api/newmethods/queryInfo.html
     * @param param 参数
     * @return 门店信息
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.queryinfo", openApiType = OpenApiType.AGENT)
    Call<MerchantInfoModel> queryMerchantInfo(@Body ParamMerchantCode param);

    /**
     * 查询商店门户状态
     * http://docs.51fubei.com/agent-api/newmethods/queryStoreStatus.html
     * @param param 参数
     * @return 门店状态
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.querystatus", openApiType = OpenApiType.AGENT)
    Call<MerchantStatusModel> queryMerchantStatus(@Body ParamMerchantCode param);

    /**
     * 商户入驻
     * http://docs.51fubei.com/agent-api/newmethods/income.html
     * @param param 参数
     * @return 商户入驻状态
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.income", openApiType = OpenApiType.AGENT)
    Call<MerchantIncomeModel> merchantIncome(@Body ParamMerchantSettle param);

    /**
     * 商户重新入驻
     * http://docs.51fubei.com/agent-api/newmethods/merchantModify.html
     * @param param 参数
     * @return 商户入驻状态
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.modify", openApiType = OpenApiType.AGENT)
    Call<MerchantIncomeModel> merchantModify(@Body ParamMerchantSettle param);

    /**
     * 商户费率修改
     * http://docs.51fubei.com/agent-api/newmethods/adjustRate.html
     * @param param 参数
     * @return 费率修改结果
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.adjustrate", openApiType = OpenApiType.AGENT)
    Call<MerchantAdjustRateModel> merchantAdjustRate(@Body ParamMerchantAdjustRate param);

    /**
     * 商户结算卡信息修改
     * http://docs.51fubei.com/agent-api/newmethods/updateBankCard.html
     * @param param 参数
     * @return 结算卡修改结果
     */
    @POST(OpenApiConstants.GATEWAY_AGENT)
    @FubeiOpenApi(method = "openapi.agent.merchant.update.bank.card", openApiType = OpenApiType.AGENT)
    Call<BankCardUpdateModel> updateBankCard(@Body ParamBankUpdate param);
}
