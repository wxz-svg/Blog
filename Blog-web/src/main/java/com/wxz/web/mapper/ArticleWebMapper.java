package com.wxz.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxz.common.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * 前台文章表(Article)表数据库访问层
 */

@Mapper
public interface ArticleWebMapper extends BaseMapper<Article> {

}
