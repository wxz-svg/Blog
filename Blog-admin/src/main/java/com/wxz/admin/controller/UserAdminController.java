package com.wxz.admin.controller;

import com.wxz.admin.domain.dto.UserAdminDTO;
import com.wxz.admin.domain.vo.UserAdminVO;
import com.wxz.admin.service.UserAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "后台用户管理")
@RestController
@RequestMapping("/admin/user")
public class UserAdminController {

    @Autowired
    private UserAdminService userAdminService;

    /**
     * 后台用户列表
     */
    @ApiOperation("后台用户列表")
    @GetMapping("/list")
    public Result<PageResult<UserAdminVO>> getUserList() {
        return userAdminService.getUserList();
    }


    /**
     * 后台用户添加
     */
    @ApiOperation("后台用户添加")
    @GetMapping("/add")
    public Result addUser(@RequestBody UserAdminDTO userAdminDTO){
        userAdminService.addUser(userAdminDTO);
        return Result.success();
    }


    /**
     * 后台用户更新
     */
    @ApiOperation("后台用户添加")
    @GetMapping("/add")
    public Result updateUser(@RequestBody UserAdminDTO userAdminDTO){
        userAdminService.updateUser(userAdminDTO);
        return Result.success();
    }


    /**
     * 后台用户删除
     */
    @ApiOperation("后台用户添加")
    @GetMapping("/add")
    public Result deleteUser(@RequestBody UserAdminDTO userAdminDTO){
        userAdminService.deleteUser(userAdminDTO);
        return Result.success();
    }

    /**
     * 用户头像修改
     */


    /**
     * 查看在线用户
     */
}
