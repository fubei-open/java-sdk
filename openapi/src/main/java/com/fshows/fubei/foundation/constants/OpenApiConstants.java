package com.fshows.fubei.foundation.constants;

/**
 * 常量定义
 *
 * @author John (linwei@fshows.com)
 * @version $Id OpenApiConstants.java, v1.0 2019-06-06 00:07 John Exp$
 */
public interface OpenApiConstants {
    /**
     * 默认签名算法
     */
    String HASH_METHOD_MD5 = "md5";

    /**
     * 默认格式
     */
    String DATA_FORMAT_JSON = "json";

    /**
     * API 1.0版本
     */
    String API_VERSION_1_0 = "1.0";

    /**
     * 网关
     */
    String GATEWAY = "gateway";

    /**
     * 网关：代理商Api
     */
    String GATEWAY_AGENT = "gateway/agent";

    /**
     * 网关
     */
    String GATEWAY_CATE = "gateway/cate";

    /**
     * 成功的结果码：200
     */
    int RESULT_CODE_SUCCESS = 200;

    /**
     * 平台方错误代码：400
     */
    int RESULT_CODE_PLATFORM_ERROR = 400;

    /**
     * debug环境
     */
    int ENV_STABLE = 0;

    /**
     * 正式环境
     */
    int ENV_RELEASE = 1;
}
