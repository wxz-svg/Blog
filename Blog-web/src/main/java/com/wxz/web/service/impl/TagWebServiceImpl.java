package com.wxz.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.TagFrontDTO;
import com.wxz.web.mapper.TagWebMapper;
import com.wxz.web.service.TagWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagWebServiceImpl extends ServiceImpl<TagWebMapper, TagFrontDTO> implements TagWebService {

    @Autowired
    private TagWebMapper tagWebMapper;

    /**
     * 前台查询标签列表
     * @return
     */
    @Override
    public Result queryTagList() {
        return null;
    }
}
