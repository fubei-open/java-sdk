package com.fshows.fubei.foundation.utils;

import com.google.common.annotations.Beta;
import com.google.common.io.BaseEncoding;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;


/**
 * 编码工具
 *
 * @author John (linwei@fshows.com)
 * @version $Id CodecUtil.java, v1.0 2019-06-28 13:33 John Exp$
 */
@SuppressWarnings("WeakerAccess")
@Beta
public class CodecUtil {
    /**
     * 将文件转为base64
     * @param file 文件
     * @return base64编码字符串
     */
    @SuppressWarnings("UnstableApiUsage")
    public static String fileToBase64(File file) throws IOException {
        return byteToBase64(Files.asByteSource(file).read());
    }

    /**
     * 将字节转数组转为base64
     * @param binary 二进制数组
     * @return base64编码字符串
     */
    public static String byteToBase64(byte[] binary) {
        return BaseEncoding.base64().encode(binary);
    }
}
