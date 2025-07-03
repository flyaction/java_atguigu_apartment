package com.atguigu.lease.web.app.service.impl;

import com.atguigu.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: action
 * @create: 2025/7/2 17:37
 **/
@SpringBootTest
class SmsServiceImplTest {

    @Autowired
    private SmsService smsService;
    @Test
    void sendCode() {
        smsService.sendCode("xxx","1234");
    }
}