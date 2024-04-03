package com.wxz.web.controller;

import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.vo.QueryTagArticlePageListReqVO;
import com.wxz.web.service.ArticleWebService;
import com.wxz.web.service.TagWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "前台标签管理")
@RequestMapping("/tag")
public class TagWebController {

    @Autowired
    private TagWebService tagWebService;

    @Autowired
    private ArticleWebService articleWebService;

    @ApiOperation("查询标签列表")
    @PostMapping("/list")
    public Result queryTagList() {
        // 查询标签列表
        return tagWebService.queryTagList();
    }

    @PostMapping("/article/list")
    @ApiOperation("获取所属标签的文章分页数据")
    public PageResult queryArticlePageList(@RequestBody @Validated QueryTagArticlePageListReqVO queryTagArticlePageListReqVO) {
        return articleWebService.queryTagArticlePageList(queryTagArticlePageListReqVO);
    }
}
