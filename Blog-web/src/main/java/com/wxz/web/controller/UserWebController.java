package com.wxz.web.controller;

import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.EmailLoginDTO;
import com.wxz.web.domain.dto.LoginDTO;
import com.wxz.web.domain.dto.PhoneLoginDTO;
import com.wxz.web.domain.dto.RegisterDTO;
import com.wxz.web.domain.vo.UserInfoVO;
import com.wxz.web.service.UserWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @ApiOperation("用户注册")
    @GetMapping("/register")
    public Result register(@Validated @RequestBody RegisterDTO registerDTO) {
        userWebService.register(registerDTO);
        return Result.success();
    }


    /**
     * 用户名密码用户登录
     */
    @ApiOperation("用户名密码用户登录")
    @GetMapping("/login")
    public Result login(@Validated @RequestBody LoginDTO loginDTO) {
        userWebService.login(loginDTO);
        return Result.success();
    }


    /**
     * 用户登出
     */
    @ApiOperation("用户登出")
    @GetMapping("/logout")
    public Result logout() {
        userWebService.logout();
        return null;
    }


    /**
     * 用户信息查询(展示)
     */
    @ApiOperation("用户信息查询(展示)")
    @GetMapping("/info")
    public Result<UserInfoVO> getUserinfo() {
        return Result.success(userWebService.getUserInfo());
    }

    /**
     * 邮箱登陆
     */
    @ApiOperation("邮箱登陆")
    @GetMapping("/email/Login")
    public Result emailLogin(@Validated @RequestBody EmailLoginDTO emailLoginDTO) {
        userWebService.emailLogin(emailLoginDTO);
        return Result.success();
    }


    /**
     * 手机号登录
     */
    @ApiOperation("手机登陆")
    @GetMapping("/phone/Login")
    public Result phoneLogin(@Validated @RequestBody PhoneLoginDTO phoneLoginDTO) {
        userWebService.phoneLogin(phoneLoginDTO);
        return Result.success();
    }


    /**
     * QQ登陆
     */


    /**
     * 微信登录
     */


    /**
     * github登陆
     */


    /**
     * gitee登陆
     */



    /**
     *邮箱认证(忘记密码)
     */
}
