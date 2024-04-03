package com.wxz.web.controller;

import com.wxz.web.service.UserWebService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "前台用户管理")
@RestController
@RequestMapping("/home/user")
public class UserWebController {

    @Autowired
    private UserWebService userWebService;


    /**
     * 用户注册
     */


    /**
     * 用户登录
     */


    /**
     * 用户登出
     */


    /**
     * 用户信息查询
     */


    /**
     * 更新用户信息
     */


    /**
     *邮箱认证(忘记密码)
     */
}
