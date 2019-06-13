package com.fshows.fubei;

import com.alibaba.fastjson.JSON;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantCommonApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantOrderApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantPaymentApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantStoreApi;
import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.biz.merchant.model.entity.PaymentCloseOrderModel;
import com.fshows.fubei.biz.merchant.model.entity.PaymentScanOrderModel;
import com.fshows.fubei.biz.merchant.model.entity.PaymentSwipeOrderModel;
import com.fshows.fubei.biz.merchant.model.entity.ServerTimeModel;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.foundation.apiproxy.MerchantApiProxy;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.http.FubeiOpenApiConverterFactory;
import com.fshows.fubei.foundation.model.RequestParam;
import com.fshows.fubei.foundation.utils.SignUtil;
import com.fshows.fubei.test.MerchantOrderIdUtil;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.TreeMap;

@RunWith(JUnit4.class)
public class OpenApiUnitTest {
    @Before
    public void init() {
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setAppId("");
        appConfig.setAppSecret("");
        appConfig.setEnv(OpenApiConstants.ENV_RELEASE);
    }

    @Test
    public void testRequest() {
        ParamPaymentOrderClose paramPaymentOrderClose = new ParamPaymentOrderClose();
        paramPaymentOrderClose.setMerchantOrderSn("28867994");
        RequestParam param = RequestParam.create(paramPaymentOrderClose);
        param.setAppId("20170609152021917511");
        param.setNonce("87sdf9806sdf73jkds");
        param.setMethod("openapi.payment.order.close");
        SignUtil.sign(param, "672f295578a545c24b397bae275e6f81");
        System.out.println(param);


        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("app_id", "20170609152021917511");
        map.put("method", "openapi.payment.order.close");
        map.put("format", "json");
        map.put("sign_method", "md5");
        map.put("nonce", "87sdf9806sdf73jkds");
        map.put("version", "1.0");

        HashMap<String, Object> content = new HashMap<String, Object>();

        content.put("merchant_order_sn", "28867994");

        map.put("biz_content", JSON.toJSONString(content));

        String secret = "672f295578a545c24b397bae275e6f81";
        String sign = com.fshows.fubei.test.SignUtil.createSign(map, secret);
        map.put("sign", sign);
    }

    @Test
    public void testRetrofit() throws IOException {
//        String baseUrl = "http://47.97.155.209:55734/";
        String baseUrl = "https://shq-api-test.51fubei.com/";
//        String baseUrl = "https://shq-api.51fubei.com/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(new FubeiOpenApiConverterFactory())
                .build();
        TestCase.assertNotNull(retrofit);
    }

    @Test
    public void testMerchantOrderId() {
        String merchantOrderId = MerchantOrderIdUtil.genMerchantOrderId();
        System.out.println(merchantOrderId);
    }

    /**
     * 服务器时间获取
     * @throws IOException
     */
    @Test
    public void testServerTime() throws IOException {
        Response<ServerTimeModel> response = MerchantApiProxy.getInstance().create(MerchantCommonApi.class).getServerTime(new Object()).execute();
        System.out.println(response.body());
    }

    /**
     * 订单关闭
     * @throws IOException
     */
    @Test
    public void testOrderClose() throws IOException {
        ParamPaymentOrderClose p = new ParamPaymentOrderClose();
        p.setMerchantOrderSn("201906130001123100003");
        Response<PaymentCloseOrderModel> response = MerchantApiProxy.getInstance().create(MerchantOrderApi.class).orderClose(p).execute();
        PaymentCloseOrderModel data = response.body();
        System.out.println(data);
    }

    /**
     * 查询门店类目
     * @throws IOException
     */
    @Test
    public void testQueryStoreCategory() throws IOException {
        ParamQueryStoreCategory p1 = new ParamQueryStoreCategory();
        Response<BizResult.StoreCategory> response = MerchantApiProxy.getInstance().create(MerchantStoreApi.class).queryStoreCategory(p1).execute();
        BizResult.StoreCategory data = response.body();
        System.out.println(data);
    }

    /**
     * 查询门店信息
     * @throws IOException
     */
    @Test
    public void testStoreQuery() throws IOException {
        ParamPaymentQueryStore p1 = new ParamPaymentQueryStore();
        Response<BizResult.StoreQuery> response = MerchantApiProxy.getInstance().create(MerchantStoreApi.class).queryStore(p1).execute();
        BizResult.StoreQuery data = response.body();
        System.out.println(data);
    }

    /**
     * 测试扫码支付
     * 注意！！使用测试环境涉及到金额扣款的接口，必须调用退款接口，否则会影响第二天清算
     * 一定要退款，切记！！！！！
     */
    @Test
    public void testScanOrder() throws IOException {
        ParamPaymentOrderScan param = new ParamPaymentOrderScan();
        param.setMerchantOrderSn(MerchantOrderIdUtil.genMerchantOrderId());
        param.setAttach("订单备注12345678");
        // 支付宝支付
        param.setType(1);
        // 可调用testStoreQuery或的StoreId
        param.setStoreId(145827);
        param.setBody("测试商品001");
        param.setTotalFee(new BigDecimal(0.1));
        PaymentScanOrderModel responseModel = MerchantApiProxy.getInstance().create(MerchantPaymentApi.class).orderScan(param).execute().body();
        System.out.println(MessageFormat.format("二维码：{0}", responseModel.getQrCode()));
    }

    /**
     * 测试扫码支付
     * 注意！！使用测试环境涉及到金额扣款的接口，必须调用退款接口，否则会影响第二天清算
     * 一定要退款，切记！！！！！
     */
    @Test
    public void testSwipeOrder() throws IOException {
        ParamPaymentOrderSwipe param = new ParamPaymentOrderSwipe();
        param.setMerchantOrderSn(MerchantOrderIdUtil.genMerchantOrderId());
        param.setAttach("订单备注12345678");
        // 支付宝支付
        param.setType(1);
        param.setAuthCode("134510811685144057");

        // 可调用testStoreQuery或的StoreId
        param.setStoreId(145827);
        param.setBody("测试商品001");
        param.setTotalFee(new BigDecimal(0.1));
        PaymentSwipeOrderModel responseModel = MerchantApiProxy.getInstance().create(MerchantPaymentApi.class).orderSwipe(param).execute().body();
        System.out.println(responseModel.toString());
    }
}
