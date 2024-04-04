package com.wxz.admin.service;

import com.wxz.admin.domain.dto.RoleAdminDTO;
import com.wxz.admin.domain.vo.RoleAdminVO;
import com.wxz.common.pojo.PageResult;

public interface RoleAdminService {
    PageResult<RoleAdminVO> getRolesList();

    Object addRole(RoleAdminDTO roleAdminDTO);

    Object delRole();

    Object updateRole(RoleAdminDTO roleAdminDTO);
}
