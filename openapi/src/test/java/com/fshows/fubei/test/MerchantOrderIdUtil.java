package com.fshows.fubei.test;

import com.fshows.fubei.foundation.utils.RandomStringUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试的MerchantId生成
 *
 * @author John (linwei@fshows.com)
 * @version $Id MerchantIdUtil.java, v1.0 2019-06-13 00:26 John Exp$
 */
public class MerchantOrderIdUtil {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    /**
     * 测试用：生成MerchantOrderId工具
     * @return 商户订单Id
     */
    public static String genMerchantOrderId() {
        String merchantOrderId = DATE_FORMAT.format(new Date()) + RandomStringUtil.randomNumberic(5);
        System.err.println(merchantOrderId);
        return merchantOrderId;
    }
}
