package com.atguigu.lease.common.utils;

import java.util.Random;

/**
 * @author: action
 * @create: 2025/7/2 16:57
 **/
public class VerifyCodeUtil {
    public static String getVerifyCode(int length) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
}
