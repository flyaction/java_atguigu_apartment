package com.atguigu.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: action
 * @create: 2025/7/2 14:44
 **/
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;
    private String username;
}