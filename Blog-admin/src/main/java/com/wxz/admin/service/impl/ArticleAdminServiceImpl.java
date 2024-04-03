package com.wxz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.admin.mapper.ArticleAdminMapper;
import com.wxz.admin.service.ArticleAdminService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ArticleAdminServiceImpl extends ServiceImpl<ArticleAdminMapper, Article> implements ArticleAdminService {

    @Autowired
    private ArticleAdminMapper articleAdminMapper;

    @Override
    public Result<PageResult<Article>> getAllArticles() {
        return null;
    }

    @Override
    public Article getArticleById(Integer articleId) {
        return null;
    }

    @Override
    public Article addArticle(Article article) {
        return null;
    }

    @Override
    public void updateArticle(Long id, Article updatedArticle) {

    }

    @Override
    public void deleteArticle(Long id) {

    }

    @Override
    public void setArticleTopStatus(Long id, boolean isTop) {

    }
}
