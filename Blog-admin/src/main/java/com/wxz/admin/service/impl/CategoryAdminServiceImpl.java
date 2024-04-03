package com.wxz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.admin.domain.dto.CategoryAdminDTO;
import com.wxz.admin.mapper.CategoryAdminMapper;
import com.wxz.admin.service.CategoryAdminService;
import com.wxz.common.pojo.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CategoryAdminServiceImpl extends ServiceImpl<CategoryAdminMapper,CategoryAdminDTO> implements CategoryAdminService {

    @Autowired
    private CategoryAdminMapper categoryAdminMapper;


    /**
     * 修改/更新分类
     * @param categoryAdminDTO
     */
    @Override
    public void updateCategory(CategoryAdminDTO categoryAdminDTO) {

    }

    /**
     * 删除分类
     * @param categoryId
     */
    @Override
    public void delCategory(Integer categoryId) {

    }

    /**
     * 添加分类
     * @param categoryAdminDTO
     */
    @Override
    public void saveCategory(CategoryAdminDTO categoryAdminDTO) {

    }

    /**
     * 查询后台分类列表
     * @return
     */
    @Override
    public PageResult<CategoryAdminDTO> listCategoriesAdmin() {
        return null;
    }
}
