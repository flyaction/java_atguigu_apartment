package com.atguigu.lease.web.app.service;

import com.atguigu.lease.web.app.vo.user.LoginVo;
import com.atguigu.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {
        void getSmsCode(String phone);

        String login(LoginVo loginVo);

        UserInfoVo getUserInfoById(Long userId);
}
