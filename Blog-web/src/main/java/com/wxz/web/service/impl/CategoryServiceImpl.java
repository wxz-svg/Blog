package com.wxz.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.CategoryDTO;
import com.wxz.web.domain.vo.QueryCategoryArticlePageListReqVO;
import com.wxz.web.mapper.CategoryWebMapper;
import com.wxz.web.service.CategoryWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryWebMapper, CategoryDTO> implements CategoryWebService {

    @Autowired
    private CategoryWebMapper categoryWebMapper;

    /**
     * 获取所有分类列表
     * @return
     */
    @Override
    public Result queryCategoryList() {
        return null;
    }

    /**
     * 获取所属分类的文章分页数据
     * @param queryCategoryArticlePageListReqVO
     * @return
     */
    @Override
    public PageResult queryCategoryArticlePageList(QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO) {
        return null;
    }
}
