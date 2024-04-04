package com.wxz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.admin.domain.dto.ArticleAdminDTO;
import com.wxz.admin.domain.vo.ArticleAdminVO;
import com.wxz.admin.domain.vo.ArticleTopFeaturedVO;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;

import java.util.List;

public interface ArticleAdminService extends IService<Article> {
    /**
     * 后台获取所有文章
     * @return
     */
    Result<PageResult<ArticleAdminVO>> getAllArticles();


    /**
     * 后台根据id获取文章
     * @param articleId
     * @return
     */
    Result<ArticleAdminVO> getArticleById(Integer articleId);

    /**
     * 后台添加文章
     * @param article
     * @return
     */
    Result<ArticleAdminDTO> addArticle(ArticleAdminDTO article);


    /**
     * 后台更新文章
     * @param id
     * @param updatedArticle
     */
    Result<ArticleAdminDTO> updateArticle(ArticleAdminDTO updatedArticle);


    /**
     * 后台删除文章
     * @param id
     */
    Result deleteArticle(List<Integer> articleIdList);

    /**
     * 后台设置文章置顶状态
     * @param id
     * @param isTop
     */
    Result setArticleTopStatus(ArticleTopFeaturedVO articleTopFeaturedVO);
}
