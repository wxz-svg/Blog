package com.wxz.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.TagFrontDTO;

public interface TagWebService extends IService<TagFrontDTO> {

    /**
     * 前台查询所有标签
     * @return
     */
    Result queryTagList();
}
