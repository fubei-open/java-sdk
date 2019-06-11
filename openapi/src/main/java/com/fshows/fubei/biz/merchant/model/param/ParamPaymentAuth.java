package com.fshows.fubei.biz.merchant.model.param;

import com.alibaba.fastjson.annotation.JSONField;
import com.fshows.fubei.foundation.model.BaseBizContentModel;

/**
 * 微信网页授权接口
 * 1.支付授权接口需要新增一个特殊参数store_id,该参数部分特殊需求商户必传；
 * 2018年4月1日之后该参数全部商户必传. 2.调用微信网页授权接口所传store_id需与调用公众号支付接口的store_id一致，否则下单失败！
 *
 * @author John (linwei@fshows.com)
 * @version $Id ParamPaymentAuth.java, v1.0 2019-06-10 00:56 John Exp$
 */
@SuppressWarnings("unused")
public class ParamPaymentAuth extends BaseBizContentModel {
    /**
     * 授权完跳转地址
     */
    @JSONField(name = "url")
    private String url;

    /**
     * 门店ID,当存在多个门店时,此字段必填; 该参数部分特殊需求商户必传；2018年4月1日之后该参数全部商户必传.
     */
    @JSONField(name = "store_id")
    private Integer storeId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
