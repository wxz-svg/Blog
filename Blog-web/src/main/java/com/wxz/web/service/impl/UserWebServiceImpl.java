package com.wxz.web.service.impl;

import com.wxz.web.domain.dto.EmailLoginDTO;
import com.wxz.web.domain.dto.LoginDTO;
import com.wxz.web.domain.dto.PhoneLoginDTO;
import com.wxz.web.domain.dto.RegisterDTO;
import com.wxz.web.domain.vo.UserInfoVO;
import com.wxz.web.service.UserWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserWebServiceImpl implements UserWebService {
    /**
     * 注册
     * @param registerDTO
     */
    @Override
    public void register(RegisterDTO registerDTO) {

    }

    /**
     * 用户名密码登录
     * @param loginDTO
     */
    @Override
    public void login(LoginDTO loginDTO) {

    }

    /**
     * 登出
     */
    @Override
    public void logout() {

    }

    /**
     * 获取用户信息
     * @return
     */
    @Override
    public UserInfoVO getUserInfo() {
        return null;
    }

    /**
     * 手机号登录
     * @param phoneLoginDTO
     */
    @Override
    public void phoneLogin(PhoneLoginDTO phoneLoginDTO) {

    }

    /**
     * 邮箱登录
     * @param emailLoginDTO
     */
    @Override
    public void emailLogin(EmailLoginDTO emailLoginDTO) {

    }
}
