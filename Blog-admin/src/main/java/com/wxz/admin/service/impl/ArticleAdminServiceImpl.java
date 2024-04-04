package com.wxz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.admin.domain.dto.ArticleAdminDTO;
import com.wxz.admin.domain.vo.ArticleAdminVO;
import com.wxz.admin.domain.vo.ArticleTopFeaturedVO;
import com.wxz.admin.mapper.ArticleAdminMapper;
import com.wxz.admin.service.ArticleAdminService;
import com.wxz.common.entity.Article;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ArticleAdminServiceImpl extends ServiceImpl<ArticleAdminMapper, Article> implements ArticleAdminService {

    @Autowired
    private ArticleAdminMapper articleAdminMapper;

    @Override
    public Result<PageResult<ArticleAdminVO>> getAllArticles() {
        return null;
    }

    @Override
    public Result<ArticleAdminVO> getArticleById(Integer articleId) {
        return null;
    }

    @Override
    public Result addArticle(ArticleAdminDTO article) {
        return null;
    }

    @Override
    public Result updateArticle(ArticleAdminDTO updatedArticle) {
        return null;
    }

    @Override
    public Result deleteArticle(List<Integer> articleIdList) {
        return null;
    }

    @Override
    public Result setArticleTopStatus(ArticleTopFeaturedVO articleTopFeaturedVO) {
        return null;
    }
}
