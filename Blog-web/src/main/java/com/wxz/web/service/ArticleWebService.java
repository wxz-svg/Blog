package com.wxz.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;

public interface ArticleWebService extends IService<Article> {
    /**
     * 根据创建时间降序分页查询文章列表
     * @return
     */
    PageResult<Article> listArticleByDescTime();


    /**
     * 获取热门文章
     * @return
     */
    Article listArticleByHot();


    /**
     * 获取置顶文章
     * @return
     */
    Article listArticleByTop();

    /**
     * 搜索文章
     * @param keyword
     * @return
     */
    Article listArticlesBySearch(String keyword);


    /**
     * 通过文章id获取文章详情
     * @param articleId
     * @return
     */
    Article getArticleHomeById(Integer articleId);

    /**
     * 点赞文章
     * @param articleId
     * @return
     */
    Article likeArticle(Integer articleId);

    /**
     * 收藏文章
     * @param articleId
     * @return
     */
    Article collectArticle(Integer articleId);
}
