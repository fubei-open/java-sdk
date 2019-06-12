package com.fshows.fubei.foundation.constants;

/**
 * 业务字段参数
 *
 * @author John (linwei@fshows.com)
 * @version $Id BizKeyConstants.java, v1.0 2019-06-06 10:59 John Exp$
 */
public interface BizKeyConstants {
    /**
     * 付呗平台分配的API接口ID（商户开放平台ID）
     */
    String APP_ID = "app_id";

    /**
     * 接口名称
     */
    String METHOD = "method";

    /**
     * 接口格式
     */
    String FORMAT = "format";

    /**
     * 签名算法
     */
    String SIGN_METHOD = "sign_method";

    /**
     * 签名
     */
    @SuppressWarnings("unused")
    String SIGN = "sign";

    /**
     * 请求端随机生成数
     */
    String NONCE = "nonce";

    /**
     * 接口版本
     */
    String VERSION = "version";

    /**
     * 业务参数
     */
    String BIZ_CONTENT = "biz_content";

    /**
     * 返回结果码
     */
    String RESULT_CODE = "result_code";

    /**
     * 平台方错误代码
     */
    String RESULT_SUBCODE = "sub_code";

    /**
     * 返回结果消息
     */
    String RESULT_MESSAGE = "result_message";

    /**
     * 数据载荷
     */
    String DATA = "data";
}
