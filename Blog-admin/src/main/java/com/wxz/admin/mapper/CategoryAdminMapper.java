package com.wxz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxz.admin.domain.dto.CategoryAdminDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryAdminMapper extends BaseMapper<CategoryAdminDTO> {
}
