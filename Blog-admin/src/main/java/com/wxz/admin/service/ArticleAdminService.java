package com.wxz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;

public interface ArticleAdminService extends IService<Article> {
    /**
     * 后台获取所有文章
     * @return
     */
    Result<PageResult<Article>> getAllArticles();


    /**
     * 后台根据id获取文章
     * @param articleId
     * @return
     */
    Article getArticleById(Integer articleId);

    /**
     * 后台添加文章
     * @param article
     * @return
     */
    Article addArticle(Article article);


    /**
     * 后台更新文章
     * @param id
     * @param updatedArticle
     */
    void updateArticle(Long id, Article updatedArticle);


    /**
     * 后台删除文章
     * @param id
     */
    void deleteArticle(Long id);

    /**
     * 后台设置文章置顶状态
     * @param id
     * @param isTop
     */
    void setArticleTopStatus(Long id, boolean isTop);
}
