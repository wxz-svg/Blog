package com.wxz.admin.controller;

import com.wxz.admin.service.UserAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
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


    /**
     * 后台用户添加
     */


    /**
     * 后台用户更新
     */


    /**
     * 后台用户删除
     */
}
