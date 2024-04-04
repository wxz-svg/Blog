package com.wxz.admin.service.impl;

import com.wxz.admin.domain.dto.UserAdminDTO;
import com.wxz.admin.domain.vo.UserAdminVO;
import com.wxz.admin.mapper.UserAdminMapper;
import com.wxz.admin.service.UserAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAdminServiceImpl implements UserAdminService {

    @Autowired
    private UserAdminMapper userAdminMapper;


    @Override
    public Result<PageResult<UserAdminVO>> getUserList() {
        return null;
    }

    @Override
    public void addUser(UserAdminDTO userAdminDTO) {

    }

    @Override
    public void updateUser(UserAdminDTO userAdminDTO) {

    }

    @Override
    public void deleteUser(UserAdminDTO userAdminDTO) {

    }
}
