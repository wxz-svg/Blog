package com.wxz.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.web.domain.dto.ArticleDTO;
import com.wxz.web.domain.vo.ArticleSearchVO;
import com.wxz.web.domain.vo.ArticleVO;
import com.wxz.web.domain.vo.QueryTagArticlePageListReqVO;

public interface ArticleWebService extends IService<Article> {
    /**
     * 根据创建时间降序分页查询文章列表
     * @return
     */
    PageResult<ArticleVO> listArticleByDescTime();


    /**
     * 获取热门文章
     * @return
     */
    ArticleVO listArticleByHot();


    /**
     * 获取置顶文章
     * @return
     */
    ArticleVO listArticleByTop();

    /**
     * 搜索文章
     * @param keyword
     * @return
     */
    ArticleSearchVO listArticlesBySearch(String keyword);


    /**
     * 通过文章id获取文章详情
     * @param articleId
     * @return
     */
    ArticleVO getArticleHomeById(Integer articleId);

    /**
     * 点赞文章
     * @param articleId
     * @return
     */
    ArticleVO likeArticle(Integer articleId);

    /**
     * 收藏文章
     * @param articleId
     * @return
     */
    ArticleVO collectArticle(Integer articleId);

    /**
     * 获取标签所属的文章
     * @param queryTagArticlePageListReqVO
     * @return
     */
    PageResult queryTagArticlePageList(QueryTagArticlePageListReqVO queryTagArticlePageListReqVO);

    /**
     * 发表文章
     * @param articleDTO
     */
    void publishArticle(ArticleDTO articleDTO);
}
