package com.wxz.web.service;

import com.wxz.web.domain.dto.EmailLoginDTO;
import com.wxz.web.domain.dto.LoginDTO;
import com.wxz.web.domain.dto.PhoneLoginDTO;
import com.wxz.web.domain.dto.RegisterDTO;
import com.wxz.web.domain.vo.UserInfoVO;

public interface UserWebService {
    /**
     * 注册
     * @param registerDTO
     */
    void register(RegisterDTO registerDTO);

    /**
     * 登录
     * @param loginDTO
     */
    void login(LoginDTO loginDTO);


    /**
     * 登出
     */
    void logout();

    /**
     * 获取用户信息
     * @return
     */
    UserInfoVO getUserInfo();

    /**
     * 手机号登录
     * @param phoneLoginDTO
     */
    void phoneLogin(PhoneLoginDTO phoneLoginDTO);


    /**
     * 邮箱登录
     * @param emailLoginDTO
     */
    void emailLogin(EmailLoginDTO emailLoginDTO);
}
