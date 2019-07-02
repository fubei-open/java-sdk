package com.fshows.fubei;

import com.alibaba.fastjson.JSON;
import com.fshows.fubei.biz.agent.api.legacy.AgentApi;
import com.fshows.fubei.biz.agent.enums.ImageBusType;
import com.fshows.fubei.biz.agent.model.entity.*;
import com.fshows.fubei.biz.agent.model.param.*;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantCommonApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantOrderApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantPaymentApi;
import com.fshows.fubei.biz.merchant.api.legacy.MerchantStoreApi;
import com.fshows.fubei.biz.merchant.model.BizResult;
import com.fshows.fubei.biz.merchant.model.entity.*;
import com.fshows.fubei.biz.merchant.model.param.*;
import com.fshows.fubei.foundation.apiproxy.FubeiOpenApiProxy;
import com.fshows.fubei.foundation.constants.OpenApiConstants;
import com.fshows.fubei.foundation.http.FubeiOpenApiConverterFactory;
import com.fshows.fubei.foundation.model.RequestParam;
import com.fshows.fubei.foundation.utils.CodecUtil;
import com.fshows.fubei.foundation.utils.SignUtil;
import com.fshows.fubei.test.MerchantOrderIdUtil;
import junit.framework.TestCase;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * 开放平台 接口demo
 * 请在idea中执行
 *
 * @author John (linwei@fshows.com)
 * @version $Id OpenApiUnitTest.java, v1.0 2019-06-28 11:11 John Exp$
 */
@SuppressWarnings("JavaDoc")
@RunWith(JUnit4.class)
public class OpenApiUnitTest {

    /**
     * 初始配置，所有UnitTest均会加载这段配置
     * 建议在程序启动时设置
     * Spring 可设置@PostConstruct
     * Android 可在Application.onCreate中
     */
    @Before
    public void init() {
        AppConfig appConfig = AppConfig.getInstance();
        // TODO: 商户级OpenApi接口调用，请填写以下设置
        // 设置商户级AppId和AppSecret，设置完成之后，可使用 biz.merchant.api.legacy接口
        appConfig.setAppId("");
        appConfig.setAppSecret("");
        // TODO: 代理商级OpenApi接口调用，请填写以下设置
        // 设置代理商级VendorSn和VendorSecret，设置完成之后，可使用 biz.agent.api.legacy接口
        appConfig.setVendorSn("");
        appConfig.setVendorSecret("");
        // 设置调用接口的环境
        appConfig.setEnv(OpenApiConstants.ENV_RELEASE);
        appConfig.setDebug(true);
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
    public void testRetrofit() {
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
        Response<ServerTimeModel> response = FubeiOpenApiProxy.getInstance().create(MerchantCommonApi.class).getServerTime(new Object()).execute();
        System.out.println(objectToString(response.body()));
    }

    /**
     * 订单关闭
     * @throws IOException
     */
    @Test
    public void testOrderClose() throws IOException {
        ParamPaymentOrderClose p = new ParamPaymentOrderClose();
        p.setMerchantOrderSn("201906130001123100003");
        Response<PaymentCloseOrderModel> response = FubeiOpenApiProxy.getInstance().create(MerchantOrderApi.class).orderClose(p).execute();
        PaymentCloseOrderModel data = response.body();
        System.out.println(objectToString(data));
    }

    /**
     * 查询门店类目
     * @throws IOException
     */
    @Test
    public void testQueryStoreCategory() throws IOException {
        ParamQueryStoreCategory p1 = new ParamQueryStoreCategory();
        Response<BizResult.StoreCategory> response = FubeiOpenApiProxy.getInstance().create(MerchantStoreApi.class).queryStoreCategory(p1).execute();
        BizResult.StoreCategory data = response.body();
        System.out.println(objectToString(data));
    }

    /**
     * 查询门店信息
     * @throws IOException
     */
    @Test
    public void testStoreQuery() throws IOException {
        ParamPaymentQueryStore p1 = new ParamPaymentQueryStore();
        Response<BizResult.StoreQuery> response = FubeiOpenApiProxy.getInstance().create(MerchantStoreApi.class).queryStore(p1).execute();
        BizResult.StoreQuery data = response.body();
        System.out.println(objectToString(data));
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
        PaymentScanOrderModel responseModel = FubeiOpenApiProxy.getInstance().create(MerchantPaymentApi.class).orderScan(param).execute().body();
        System.out.println(objectToString(responseModel));
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
        PaymentSwipeOrderModel responseModel = FubeiOpenApiProxy.getInstance().create(MerchantPaymentApi.class).orderSwipe(param).execute().body();
        System.out.println(objectToString(responseModel));
    }


    /************************** 以下为代理商接口，请确保VendorSN和VendorSecret已设置 ***********************************/
    /**
     * 代理商，查询银行卡和支行Demo
     * @throws IOException
     */
    @Test
    public void testQueryBank() throws IOException {
        ParamBanks param = new ParamBanks();
        param.setBankCard("6225800521774785");
        BankModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).queryBanks(param).execute().body();
        System.out.println(objectToString(responseModel));

        String bankName = "招商银行";
        ParamBankBranches param2 = new ParamBankBranches();
        param2.setBankName(bankName);
        param2.setCityCode("3310");
        com.fshows.fubei.biz.agent.model.BizResult.BankBranches branchModels = FubeiOpenApiProxy.getInstance().create(AgentApi.class).queryBankBranches(param2).execute().body();
        System.out.println(objectToString(branchModels));
    }

    /**
     * 图片上传测试
     */
    @Test
    public void testImageUpload() throws IOException {
        ParamImgUpload param = new ParamImgUpload();
        String base64Pic = CodecUtil.fileToBase64(new File("/Users/John/Desktop/test.png"));
        param.setBusType(ImageBusType.OTHER);
        param.setFileData(base64Pic);
        ImgUploadModel result = FubeiOpenApiProxy.getInstance().create(AgentApi.class).imageUpload(param).execute().body();
        System.out.println(objectToString(result));
    }

    /**
     * 获得图片地址
     */
    @Test
    public void testGetImage() throws IOException {
        ParamGetImageUrl param = new ParamGetImageUrl();
        param.setKey("openapi/other/c092df9c248440d1a7c5b7e993bebb33.png");
        GetImageModel result = FubeiOpenApiProxy.getInstance().create(AgentApi.class).getImageUrl(param).execute().body();
        System.out.println(objectToString(result));
        System.out.println(result.getUploadUrl());
    }

    /**
     * 获得商户状态
     */
    @Test
    public void testQueryMerchantInfo() throws IOException {
        ParamMerchantCode param = new ParamMerchantCode();
        param.setMerchantCode("merchantHotfix2");
        MerchantInfoModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).queryMerchantInfo(param).execute().body();
        System.out.println(objectToString(responseModel));
    }

    /**
     * 获得商户状态
     */
    @Test
    public void testQueryMerchantStatus() throws IOException {
        ParamMerchantCode param = new ParamMerchantCode();
        param.setMerchantCode("merchantHotfix2");
        MerchantStatusModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).queryMerchantStatus(param).execute().body();
        System.out.println(objectToString(responseModel));
    }

    /**
     * 商户入驻
     * 商户入驻和商户修改接口功能类似出入参完全一致
     * 区别是入驻返回带商户AppID和AppSecret而修改接口不带
     */
    @Test
    public void testMerchantIncome() throws IOException {
        ParamMerchantSettle param = new ParamMerchantSettle();
        // 商户号 自定义的唯一商户编号
        param.setMerchantCode("SDK-MERCHANT-001");
        // 商户手机号
        param.setContactPhone("15024446523");
        // 客服电话 若该字段为空，则取值contact_phone
        param.setServicePhone("15024446523");
        // 电子邮箱 商户邮箱信息
        param.setEmail("xxxxxxxxxxxxx@qq.com");
        // 品类id 门店品类列表 参见"商户类目"中category_id值
        // http://docs.51fubei.com/agent-api/other/category_v2.html
        param.setUnityCategoryId(20);
        // 账户类型 1:个人 2:企业
        param.setAccountType(1);
        // 真实姓名
        param.setRealName("休利特");
        // 身份证号
        param.setIdCardNo("330105198505236191");
        // 身份证正面照地址(国徽面）
        param.setIdCardFrontPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxx.png");
        // 身份证反面照地址（人像面）
        param.setIdCardBackPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxx.png");
        // 银行卡号
        param.setBankCardNo("6217856200027621676");
        // 银行卡照片地址
        // 账户类型account_type为2(企业) 填企业账户开户许可证
        param.setBankCardImage("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxx.png!water");
        // 银行预留手机号
        param.setBankCellPhone("15024446523");
        // 所属银行编码, 通过“查询开户银行接口”获取 AgentApi.queryBanks()
        param.setBankCode("308584000013");
        // 大小额联行号
        // 账户类型为1(个人)则非必填
        // 通过"查询支行列表接口"获取 AgentApi.queryBankBranches()
        param.setUnionpayCode("308331012271");
        // 门店名称
        param.setStoreName("shencw的西瓜店");
        // 门店电话
        param.setStorePhone("15024446523");
        // 编码参考"全国省市自治区编号"中code值 http://docs.51fubei.com/agent-api/other/areas_v2.html
        // 省份编码
        param.setProvinceCode("330000");
        // 城市编码
        param.setCityCode("330100");
        // 区域编码
        param.setAreaCode("330104");
        // 详细地址s
        param.setStreetAddress("丰盛九玺");
        // 纬度
        param.setLatitude("30.329254");
        // 经度
        param.setLongitude("120.069606");
        // 门店经营许可类型
        // 1：营业执照 2：证明函  若account_type为2（企业），则该字段必须为1（营业执照）
        param.setLicenseType(1);
        // 营业执照/证明函照片地址
        // 如果门店经营许可类型为1:必填 营业执照照片 2:选填 证明函照片
        param.setLicensePhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxxxxxxxxxxxxx.png");
        // 手持身份证照片
        // 如果门店经营许可类型为1(营业执照):无需填写 2(证明函):必填
        param.setHandHoldIdCardPic("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxxxxxxs.png");
        // 营业执照名称
        // 门店经营许可类型为1(营业执照)则必填
        param.setLicenseName("");
        // 营业执照号
        // 门店经营许可类型为1(营业执照)则必填
        param.setLicenseId("");
        // 营业执照有效期类型 1:正常有效期 2：长期有效 门店经营许可类型为1必传
        param.setLicenseTimeType(1);
        // 营业执照有效期开始时间 门店经营许可类型为1(营业执照) 且 营业执照有效期类型为1(正常有效期)时必填
        // 格式：YYYY-MM-DD
        param.setLicenseTimeBegin("2010-01-01");
        // 营业执照有效期结束时间 门店经营许可类型为1(营业执照) 且 营业执照有效期类型为1(正常有效期)时必填
        // 格式：YYYY-MM-DD
        param.setLicenseTimeEnd("2020-01-01");
        // 经营许可证图片地址
        param.setOperatingLicensePhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 门头照片
        param.setStoreFrontImgUrl("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxxx.png");
        // 门店店内环境照片
        param.setStoreEnvPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 门店收银台照片
        param.setStoreCashPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 其他照片
        param.setOtherPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 备注
        param.setRemark("我是一条备注");
        // 以下费率设置，只允许有调整费率权限情况下传值，否则会报错
        // 支付宝商户终端费率
         param.setAlipayFeeRate("");
        // 微信商户终端费率
        // param.setWxFeeRateFloat("3.8");
        MerchantIncomeModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).merchantIncome(param).execute().body();
        System.out.println(objectToString(responseModel));
    }

    /**
     * 门店信息修改
     * http://localhost:4000/newmethods/storeInfoModify.html
     * @throws IOException
     */
    @Test
    public void testChangeStoreInfo() throws IOException {
        ParamCateStoreInfo param = new ParamCateStoreInfo();
        param.setMerchantId(1);
        param.setStoreId(1);
        // 门店名称
        param.setStoreName("xxx的水果店");
        param.setStreetAddress("杭州万塘路18号黄龙时代广场B座");
        // 门店地址经度
        param.setLongitude("30.273");
        // 门店地址纬度
        param.setLatitude("120.124");
        // 省份编码
        param.setProvinceCode("330000");
        // 城市编码
        param.setCityCode("330100");
        // 区域编码
        param.setAreaCode("330104");
        // 门店电话
        param.setStorePhone("15024446523");
        // 品类Id
        param.setUnityCategoryId(12);
        // 门头照片
        param.setStoreFrontImgUrl("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 门店店内环境照片
        param.setStoreEnvPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 门店收银台照片
        param.setStoreCashPhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 门店经营许可类型
        param.setLicenseType(1);
        // 手持身份证照片
        param.setHandHoldIdCardPic("");
        // 营业执照名称
        param.setLicenseName("xxxx有限公司");
        // 营业执照号
        param.setLicenseId("aaaaaaaaaaaaaaaaaaaaaaaa");
        // 营业执照有效期类型
        param.setLicenseType(1);
        // 营业执照有效期开始时间
        param.setLicenseTimeBegin("2019-01-01");
        // 营业执照有效期结束时间
        param.setLicenseTimeEnd("2019-01-01");
        // 品牌名称
        param.setBrandName("xxxx");
        // 经营许可证图片地址
        param.setOperatingLicensePhoto("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 其他照片
        param.setOtherPic1("https://bplan-security-pic.oss-cn-hangzhou.aliyuncs.com/upload/20190628/xxxxxxxxxx.png");
        // 备注
        param.setRemark("");
        CateStoreInfoModel responseModel = FubeiOpenApiProxy.getInstance().create(AgentApi.class).updateStoreInfo(param).execute().body();
        System.out.println(objectToString(responseModel));
    }

    private static String objectToString(Object object) {
        return ReflectionToStringBuilder.reflectionToString(object, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
