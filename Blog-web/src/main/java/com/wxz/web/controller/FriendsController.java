package com.wxz.web.controller;

import com.wxz.web.service.FriendsService;
import com.wxz.web.service.FriendsWebService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "粉丝管理")
@RestController
@RequestMapping("/home/friend")
public class FriendsController {

    @Autowired
    private FriendsWebService friendsWebService;

    /**
     * 获取当前用户对象的粉丝列表
     */


    /**
     * 获取当前用户关注的人列表
     */


    /**
     * 关注/取消关注某人
     */


    /**
     * 发送私信
     */


    /**
     * 获取(保存)与某人的聊天记录
     */

}
