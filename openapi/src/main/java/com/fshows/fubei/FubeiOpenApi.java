package com.fshows.fubei;

import com.fshows.fubei.biz.agent.api.legacy.AgentApi;
import com.fshows.fubei.biz.agent.model.entity.MerchantStatusModel;
import com.fshows.fubei.biz.agent.model.param.ParamMerchantCode;
import com.fshows.fubei.foundation.apiproxy.FubeiOpenApiProxy;

import java.io.IOException;

public class FubeiOpenApi {
    public static void main(String[] args) throws IOException {
        ParamMerchantCode param = new ParamMerchantCode();
        param.setMerchantCode("merchantHotfix2");
        MerchantStatusModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).queryMerchantStatus(param).execute().body();
        System.out.println(responseModel);
    }
}
