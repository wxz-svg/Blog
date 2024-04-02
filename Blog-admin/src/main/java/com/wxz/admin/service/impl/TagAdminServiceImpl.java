package com.wxz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.admin.domain.dto.TagBackDTO;
import com.wxz.admin.mapper.TagAdminMapper;
import com.wxz.admin.service.TagAdminService;
import com.wxz.common.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagAdminServiceImpl extends ServiceImpl<TagAdminMapper, TagBackDTO> implements TagAdminService {

    @Autowired
    private TagAdminMapper tagAdminMapper;

    @Override
    public PageResult<TagBackDTO> getListTags() {
        return null;
    }

    @Override
    public void addTags(TagBackDTO tagBackDTO) {

    }

    @Override
    public void deleteTags(List<Integer> tagIdList) {

    }

    @Override
    public List<TagBackDTO> listTagsAdminBySearch(String keywords) {
        return null;
    }

    @Override
    public void updateTags(TagBackDTO tag) {

    }
}
