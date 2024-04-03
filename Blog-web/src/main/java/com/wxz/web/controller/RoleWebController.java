package com.wxz.web.controller;

import com.wxz.web.service.RoleWebService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "前台角色管理")
@RestController
@RequestMapping("/home/role")
public class RoleWebController {

    @Autowired
    private RoleWebService roleWebService;

    /**
     * 查看当前用户对象的角色
     */
}
