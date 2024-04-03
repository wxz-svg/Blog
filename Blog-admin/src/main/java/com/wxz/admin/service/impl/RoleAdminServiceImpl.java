package com.wxz.admin.service.impl;

import com.wxz.admin.mapper.RoleAdminMapper;
import com.wxz.admin.service.RoleAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleAdminServiceImpl implements RoleAdminService {

    @Autowired
    private RoleAdminMapper roleAdminMapper;
}
