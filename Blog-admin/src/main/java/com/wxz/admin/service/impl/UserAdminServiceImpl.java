package com.wxz.admin.service.impl;

import com.wxz.admin.mapper.UserAdminMapper;
import com.wxz.admin.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAdminServiceImpl implements UserAdminService {

    @Autowired
    private UserAdminMapper userAdminMapper;


}
