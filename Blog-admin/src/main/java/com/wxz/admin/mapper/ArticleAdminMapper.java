package com.wxz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxz.common.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleAdminMapper extends BaseMapper<Article> {
}
