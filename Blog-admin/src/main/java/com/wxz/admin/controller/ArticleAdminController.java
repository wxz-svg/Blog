package com.wxz.admin.controller;

import com.wxz.admin.service.ArticleAdminService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/article")
@Api(tags = "后台文章相关接口")
public class ArticleAdminController {

    @Autowired
    private ArticleAdminService articleAdminService;


    /**
     * 获取所有文章列表
     * @return
     */
    @GetMapping("")
    @ApiOperation("获取所有文章列表")
    public Result<PageResult<Article>> getArticles() {
        return articleAdminService.getAllArticles();
    }


    /**
     * 根据ID获取文章
     * @param articleId
     * @return
     */
    @GetMapping("/{articleId}")
    @ApiOperation("根据ID获取相对应的文章")
    public Article getArticle(@PathVariable("articleId") Integer articleId) {
        return articleAdminService.getArticleById(articleId);
    }

    /**
     * 新增文章
     * @param article
     * @return
     */
    @PostMapping("/add")
    @ApiOperation("新增文章")
    public Article createArticle(@RequestBody Article article) {
        return articleAdminService.addArticle(article);
    }

    // 后台文章编辑接口（包括置顶状态修改）
    @PutMapping("/{id}")
    @ApiOperation("更新文章信息（包含是否置顶状态）")
    public void updateArticle(@PathVariable("id") Long id, @RequestBody Article updatedArticle) {
        articleAdminService.updateArticle(id, updatedArticle);
    }

    // 后台文章删除接口
    @DeleteMapping("/{id}")
    @ApiOperation("删除文章")
    public void deleteArticle(@PathVariable("id") Long id) {
        articleAdminService.deleteArticle(id);
    }

    // 增加一个后台文章置顶操作接口
    @PutMapping("/{id}/top")
    @ApiOperation("设置或取消文章置顶状态")
    public void setArticleTopStatus(@PathVariable("id") Long id, @RequestParam boolean isTop) {
        articleAdminService.setArticleTopStatus(id, isTop);
    }
}

