package com.wxz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.admin.domain.dto.TagBackDTO;
import com.wxz.common.pojo.PageResult;

import java.util.List;

public interface TagAdminService extends IService<TagBackDTO> {
    /**
     * 获取标签列表
     * @return
     */
    PageResult<TagBackDTO> getListTags();

    /**
     * 新增标签
     * @param tagBackDTO
     */
    void addTags(TagBackDTO tagBackDTO);

    /**
     * 更新标签
     * @param tagIdList
     */
    void deleteTags(List<Integer> tagIdList);

    /**
     * 搜索标签
     * @param keywords
     * @return
     */
    List<TagBackDTO> listTagsAdminBySearch(String keywords);

    /**
     * 更新标签
     * @param tag
     */
    void updateTags(TagBackDTO tag);
}
