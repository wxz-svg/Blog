package com.wxz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.admin.domain.dto.CategoryAdminDTO;
import com.wxz.common.pojo.PageResult;

public interface CategoryAdminService extends IService<CategoryAdminDTO> {
    /**
     * 修改分类
     * @param categoryAdminDTO
     */
    public void updateCategory(CategoryAdminDTO categoryAdminDTO);

    /**
     * 删除分类
     * @param categoryId
     */
    public void delCategory(Integer categoryId);

    /**
     * 添加分类
     * @param categoryAdminDTO
     */
    public void saveCategory(CategoryAdminDTO categoryAdminDTO);

    /**
     * 查看后台分类列表
     * @return
     */
    public PageResult<CategoryAdminDTO> listCategoriesAdmin();
}
