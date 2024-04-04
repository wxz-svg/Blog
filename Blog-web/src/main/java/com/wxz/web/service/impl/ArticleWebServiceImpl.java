package com.wxz.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.web.domain.dto.ArticleDTO;
import com.wxz.web.domain.vo.ArticleSearchVO;
import com.wxz.web.domain.vo.ArticleVO;
import com.wxz.web.domain.vo.QueryTagArticlePageListReqVO;
import com.wxz.web.mapper.ArticleWebMapper;
import com.wxz.web.service.ArticleWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ArticleWebServiceImpl extends ServiceImpl<ArticleWebMapper, Article> implements ArticleWebService {

    @Autowired
    private ArticleWebMapper articleWebMapper;

    /**
     * 获取首页文章列表
     * @return
     */
    @Override
    public PageResult<ArticleVO> listArticleByDescTime() {
        return null;
    }

    /**
     * 获取最热文章
     * @return
     */
    @Override
    public ArticleVO listArticleByHot() {
        return null;
    }

    /**
     * 获取置顶文章
     * @return
     */
    @Override
    public ArticleVO listArticleByTop() {
        return null;
    }

    /**
     * 搜索文章列表
     * @param keyword
     * @return
     */
    @Override
    public ArticleSearchVO listArticlesBySearch(String keyword) {
        return null;
    }

    /**
     * 获取文章详情
     * @param articleId
     * @return
     */
    @Override
    public ArticleVO getArticleHomeById(Integer articleId) {
        return null;
    }

    /**
     * 点赞文章
     * @param articleId
     * @return
     */
    @Override
    public ArticleVO likeArticle(Integer articleId) {
        return null;
    }

    /**
     * 收藏文章
     * @param articleId
     * @return
     */
    @Override
    public ArticleVO collectArticle(Integer articleId) {
        return null;
    }

    /**
     * 根据标签查询文章列表
     * @param queryTagArticlePageListReqVO
     * @return
     */
    @Override
    public PageResult queryTagArticlePageList(QueryTagArticlePageListReqVO queryTagArticlePageListReqVO) {
        return null;
    }

    /**
     * 发表文章
     * @param articleDTO
     */
    @Override
    public void publishArticle(ArticleDTO articleDTO) {

    }
}
