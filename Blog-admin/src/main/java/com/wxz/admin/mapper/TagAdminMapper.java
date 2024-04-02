package com.wxz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wxz.admin.domain.dto.TagBackDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagAdminMapper extends BaseMapper<TagBackDTO> {
}
