package com.fshows.fubei.foundation.utils;

import java.util.Random;

/**
 * 随机字符串生成工具
 *
 * @author John (linwei@fshows.com)
 * @version $Id RandomStringUtil.java, v1.0 2019-06-06 17:55 John Exp$
 */
@SuppressWarnings("unused")
public class RandomStringUtil {
    /**
     * 字母表
     */
    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /**
     * 数字表
     */
    private static final char[] NUMBERIC = "1234567890".toCharArray();

    /**
     * 字母+数字表
     */
    private static final char[] ALL = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" + "1234567890").toCharArray();

    /**
     * 生成随机字母 + 数字字符串
     * @param digit 位数
     * @return 随机字符串
     */
    public static String randomString(int digit) {
        return randomStringInternal(digit, ALL);
    }

    /**
     * 生成随机字母字符串
     * @param digit 位数
     * @return 随机字符串
     */
    public static String randomAlphabet(int digit) {
        return randomStringInternal(digit, ALPHABET);
    }

    /**
     * 生成随机数字字符串
     * @param digit 位数
     * @return 随机字符串
     */
    public static String randomNumberic(int digit) {
        return randomStringInternal(digit, NUMBERIC);
    }


    /**
     * 生成随机字符串
     * @param digit 位数
     * @param seed 随机数字符
     * @return 随机字符串
     */
    private static String randomStringInternal(int digit, char[] seed) {
        StringBuilder sb = new StringBuilder(digit);
        Random random = new Random();
        for (int i = 0; i != digit; ++i) {
            sb.append(seed[random.nextInt(seed.length)]);
        }
        return sb.toString();
    }
}
