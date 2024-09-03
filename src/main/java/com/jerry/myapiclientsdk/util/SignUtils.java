package com.jerry.myapiclientsdk.util;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * 生成签名秘钥
 */
public class SignUtils {
    public static String genSign(String body, String secretKey) {
        return DigestUtil.md5Hex(body + "." + secretKey);
    }
}
