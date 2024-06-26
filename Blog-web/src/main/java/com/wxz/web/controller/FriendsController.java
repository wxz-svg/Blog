package com.wxz.web.controller;

import com.wxz.common.pojo.Result;
import com.wxz.web.domain.vo.FriendsVO;
import com.wxz.web.service.FriendsWebService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "粉丝管理")
@RestController
@RequestMapping("/home/friend")
public class FriendsController {

    @Autowired
    private FriendsWebService friendsWebService;

    /**
     * 获取当前用户对象的粉丝列表
     */
    public Result<List<FriendsVO>> getFansList(){
        return friendsWebService.getFansList();
    }


    /**
     * 获取当前用户关注的人列表
     */
    public Result<List<FriendsVO>> getFollowList(){
        return friendsWebService.getFollowList();
    }

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
