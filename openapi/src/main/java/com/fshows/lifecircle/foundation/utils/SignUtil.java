package com.fshows.lifecircle.foundation.utils;

import com.fshows.lifecircle.foundation.constants.BizKeyConstants;
import com.fshows.lifecircle.foundation.model.RequestParam;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;

import javax.annotation.Nonnull;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * 签名工具
 *
 * @author John (linwei@fshows.com)
 * @version $Id SignUtil.java, v1.0 2019-06-06 10:43 John Exp$
 */
public class SignUtil {
    /**
     * 对参数请求进行签名
     * 签名规则见：http://docs.51fubei.com/open-api/business/sign.html
     *
     * @param requestParam 待签名的请求参数
     * @param appSecret 商户密钥
     */
    public static void sign(RequestParam requestParam, String appSecret) {
        String baseStr = baseString(requestParam, appSecret);
        // 获得BaseString后，对字符串做MD5 hash并转为大写
        //noinspection UnstableApiUsage
        String sig = Hashing.md5().hashString(baseStr, StandardCharsets.UTF_8).toString().toUpperCase();
        requestParam.setSign(sig);
    }

    /**
     * 生成待签名的元字符串
     *
     * @param requestParam 请求的参数
     * @param appSecret 商户密钥
     * @return 用于签名的元字符串
     */
    @Nonnull
    private static String baseString(RequestParam requestParam, String appSecret) {
        // 将requestParam对象转为Map
        StringBuilder sb = new StringBuilder();
        // 对所有API请求参数（包括公共参数和请求参数，但除去sign参数），根据参数名称的ASCII码表的顺序排序
        Map<String, String> dataMapper = mapper(requestParam);
        // 将排序好的参数名和参数值拼装在一起，用&符号连接
        Joiner.on("&").withKeyValueSeparator("=").appendTo(sb, dataMapper);
        // 在拼接好的字符串后面无缝添加商户密钥（商户平台Secret）
        sb.append(appSecret);
        return sb.toString();
    }

    /**
     * 将请求参数对象转为红黑树映射
     * @param param 参数对象
     * @return 映射
     */
    @Nonnull
    private static Map<String, String> mapper(RequestParam param) {
        Map<String, String> mapper = Maps.newTreeMap();
        mapper.put(BizKeyConstants.APP_ID, param.getAppId());
        mapper.put(BizKeyConstants.METHOD, param.getMethod());
        mapper.put(BizKeyConstants.FORMAT, param.getFormat());
        mapper.put(BizKeyConstants.SIGN_METHOD, param.getSignMethod());
        mapper.put(BizKeyConstants.NONCE, param.getNonce());
        mapper.put(BizKeyConstants.VERSION, param.getVersion());
        mapper.put(BizKeyConstants.BIZ_CONTENT, param.getBizContent());
        return mapper;
    }
}
