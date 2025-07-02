package com.atguigu.lease.common.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: action
 * @create: 2025/7/2 16:44
 **/
@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliyunSMSProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String endpoint;
}