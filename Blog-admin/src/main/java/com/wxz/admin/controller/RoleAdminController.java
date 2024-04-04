package com.wxz.admin.controller;

import com.wxz.admin.domain.dto.RoleAdminDTO;
import com.wxz.admin.domain.vo.RoleAdminVO;
import com.wxz.admin.service.RoleAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @ApiOperation("获取后台角色列表")
    @GetMapping("/list")
    public Result<PageResult<RoleAdminVO>> getRolesList() {
        return Result.success(roleAdminService.getRolesList());
    }


    /**
     * 新增角色
     */
    @ApiOperation("新增角色")
    @GetMapping("/list")
    public Result addRole(@RequestBody RoleAdminDTO roleAdminDTO) {
        return Result.success(roleAdminService.addRole(roleAdminDTO));
    }

    /**
     * 删除角色
     */
    @ApiOperation("删除角色")
    @GetMapping("/list")
    public Result delRole() {
        return Result.success(roleAdminService.delRole());
    }


    /**
     * 角色权限修改
     */
    @ApiOperation("获取后台角色列表")
    @GetMapping("/update")
    public Result updateRole(@RequestBody RoleAdminDTO roleAdminDTO) {
        return Result.success(roleAdminService.updateRole(roleAdminDTO));
    }
}
