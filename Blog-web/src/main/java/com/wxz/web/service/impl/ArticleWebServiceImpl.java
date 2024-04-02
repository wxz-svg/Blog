package com.wxz.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.web.mapper.ArticleWebMapper;
import com.wxz.web.service.ArticleWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleWebServiceImpl extends ServiceImpl<ArticleWebMapper, Article> implements ArticleWebService {

    @Autowired
    private ArticleWebMapper articleWebMapper;


    @Override
    public PageResult<Article> listArticleByDescTime() {
        return null;
    }

    @Override
    public Article listArticleByHot() {
        return null;
    }

    @Override
    public Article listArticleByTop() {
        return null;
    }

    @Override
    public Article listArticlesBySearch(String keyword) {
        return null;
    }

    @Override
    public Article getArticleHomeById(Integer articleId) {
        return null;
    }

    @Override
    public Article likeArticle(Integer articleId) {
        return null;
    }

    @Override
    public Article collectArticle(Integer articleId) {
        return null;
    }
}
