package com.wxz.web.controller;

import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.ArticleDTO;
import com.wxz.web.domain.vo.ArticleSearchVO;
import com.wxz.web.domain.vo.ArticleVO;
import com.wxz.web.service.ArticleWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 前台文章相关接口
 * @author wxz
 */
@RestController
@RequestMapping("/home/article")
@Api(tags = "前台文章相关接口")
public class ArticleWebController {

    @Autowired
    public ArticleWebService articleWebService;

    /**
     * 获取首页文章列表---按照最新时间依次排列
     *
     * @return
     */
    @ApiOperation("获取首页文章列表")
    @GetMapping("/list")
    public Result<PageResult<ArticleVO>> listArticleFront() {
        return Result.success(articleWebService.listArticleByDescTime());
    }

    /**
     * 分布文章
     * @param articleDTO
     * @return
     */
    @ApiOperation("发布文章")
    @GetMapping("/publish")
    public Result publishArticle(ArticleDTO articleDTO) {
        articleWebService.publishArticle(articleDTO);
        return Result.success();
    }

    /**
     * 获取热门文章
     * @return
     */
    @ApiOperation("获取热门文章")
    @GetMapping("/hot")
    public Result<ArticleVO> getHotArticle() {
        return Result.success(articleWebService.listArticleByHot());
    }

    /**
     * 获取置顶文章
     * @return
     */
    @ApiOperation("获取置顶文章")
    @GetMapping("/top")
    public Result<ArticleVO> getNewArticle() {
        return Result.success(articleWebService.listArticleByTop());
    }

    /**
     * 搜索文章
     * @return
     */
    @ApiOperation("搜索文章")
    @GetMapping("/search")
    public Result<ArticleSearchVO> listArticlesBySearch(String keyword) {
        return Result.success(articleWebService.listArticlesBySearch(keyword));
    }

    /**
     * 根据文章id获取文章详情
     * @param articleId
     * @return
     */

    @ApiOperation("根据文章id获取文章详情")
    @GetMapping("articleId")
    public Result<ArticleVO> getArticleHomeById(@PathVariable("articleId") Integer articleId){
        return Result.success(articleWebService.getArticleHomeById(articleId));
    }

    /**
     * 点赞文章
     */
    @ApiOperation("点赞文章")
    @GetMapping("/{articleId}/like")
    public Result<ArticleVO> likeArticle(@PathVariable("articleId") Integer articleId){
        return Result.success(articleWebService.likeArticle(articleId));
    }

    /**
     * 收藏文章
     */
    @ApiOperation("收藏文章")
    @GetMapping("/{articleId}/collect")
    public Result<ArticleVO> collectArticle(Integer articleId){
        return Result.success(articleWebService.collectArticle(articleId));
    }

}
