package com.wxz.web.controller;

import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.service.TalkWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "前台说说接口")
@RestController
@RequestMapping("/home/talk")
public class TalkWebController {

    @Autowired
    private TalkWebService talkWebService;

    /**
     * 获取前台说说列表
     */
//    @ApiOperation("获取前台说说列表")
//    @PostMapping("/list")
//    public Result<PageResult<TalkVO>> getTalkList(){
//        return talkWebService.getTalkList(pageNo,pageSize);
//    }

    /**
     * 分布说说
     */


    /**
     *查看说说（就是点进去看看）
     */



    /**
     * 点赞说说
     */
}
