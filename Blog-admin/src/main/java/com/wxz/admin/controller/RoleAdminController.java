package com.wxz.admin.controller;

import com.wxz.admin.service.RoleAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "后台角色管理")
@RestController
@RequestMapping("/admin/role")
public class RoleAdminController {

    @Autowired
    private RoleAdminService roleAdminService;

    /**
     * 获取角色列表
     */


    /**
     * 新增角色
     */

    /**
     * 删除角色
     */


    /**
     * 角色权限修改
     */
}
