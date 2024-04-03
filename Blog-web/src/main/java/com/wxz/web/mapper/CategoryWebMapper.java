package com.wxz.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxz.web.domain.dto.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryWebMapper extends BaseMapper<CategoryDTO> {
}
