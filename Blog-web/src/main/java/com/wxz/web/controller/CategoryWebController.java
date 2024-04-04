package com.wxz.web.controller;

import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.CategoryDTO;
import com.wxz.web.domain.vo.CategoryVO;
import com.wxz.web.domain.vo.QueryCategoryArticlePageListReqVO;
import com.wxz.web.service.CategoryWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "前台分类管理")
@RestController
@RequestMapping("/home/category")
public class CategoryWebController {

    @Autowired
    private CategoryWebService categoryWebService;


    /**
     * 查看分类列表
     * @return
     */
    @PostMapping("/list")
    @ApiOperation("获取所有分类选项")
    public Result<List<CategoryVO>> queryCategoryList() {
        return categoryWebService.queryCategoryList();
    }

    @PostMapping("/article/list")
    @ApiOperation("获取所属分类的文章分页数据")
    public PageResult queryArticlePageList(@RequestBody @Validated QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO) {
        return categoryWebService.queryCategoryArticlePageList(queryCategoryArticlePageListReqVO);
    }



}
