package com.wxz.admin.controller;

import com.wxz.admin.service.FriendsAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "后台关注管理")
@RestController
@RequestMapping("/admin/friends")
public class FriendsAdminController {

    @Autowired
    private FriendsAdminService friendsAdminService;

    /**
     * 搜索用户的粉丝
     */

    /**
     * 查看用户间的聊天记录（管理员视角)
     */


    /**
     * 管理员发送系统通知给用户(系统通知---就放这里吧)
     */
}
