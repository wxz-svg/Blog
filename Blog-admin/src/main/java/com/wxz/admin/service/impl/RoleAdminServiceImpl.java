package com.wxz.admin.service.impl;

import com.wxz.admin.domain.dto.RoleAdminDTO;
import com.wxz.admin.domain.vo.RoleAdminVO;
import com.wxz.admin.mapper.RoleAdminMapper;
import com.wxz.admin.service.RoleAdminService;
import com.wxz.common.pojo.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RoleAdminServiceImpl implements RoleAdminService {

    @Autowired
    private RoleAdminMapper roleAdminMapper;

    @Override
    public PageResult<RoleAdminVO> getRolesList() {
        return null;
    }

    @Override
    public Object addRole(RoleAdminDTO roleAdminDTO) {
        return null;
    }

    @Override
    public Object delRole() {
        return null;
    }

    @Override
    public Object updateRole(RoleAdminDTO roleAdminDTO) {
        return null;
    }
}
