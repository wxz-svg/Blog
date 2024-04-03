package com.wxz.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.CategoryDTO;
import com.wxz.web.domain.vo.QueryCategoryArticlePageListReqVO;

public interface CategoryWebService extends IService<CategoryDTO> {
    /**
     * 查询所有分类
     * @return
     */
    Result queryCategoryList();

    /**
     * 获取所属分类的文章分页数据
     * @param queryCategoryArticlePageListReqVO
     * @return
     */
    PageResult queryCategoryArticlePageList(QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO);
}
