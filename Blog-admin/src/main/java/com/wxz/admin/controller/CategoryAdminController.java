package com.wxz.admin.controller;

import com.wxz.admin.domain.dto.CategoryAdminDTO;
import com.wxz.admin.service.CategoryAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "后台分类管理")
@RequestMapping("/admin/category")
public class CategoryAdminController {

    @Autowired
    private CategoryAdminService categoryAdminService;

    /**
     * 查看后台分类列表
     * @param
     * @return
     */
    @ApiOperation(value = "查看后台分类列表")
    @GetMapping("/list")
    public Result<PageResult<CategoryAdminDTO>> listCategoriesAdmin() {
        return Result.success(categoryAdminService.listCategoriesAdmin());
    }

    /**
     * 添加分类
     * @param categoryAdminDTO
     * @return
     */
    @ApiOperation(value = "添加分类")
    @PostMapping("/add")
    public Result addCategory(CategoryAdminDTO categoryAdminDTO) {
        // 添加分类
        categoryAdminService.saveCategory(categoryAdminDTO);
        return Result.success();
    }


    /**
     * 删除分类
     * @param categoryId
     * @return
     */
    @ApiOperation(value = "删除分类")
    @PostMapping("/delete/{categoryId}")
    public Result delCategory(@PathVariable("categoryId") @RequestBody Integer categoryId) {
        //删除分类
        categoryAdminService.delCategory(categoryId);
        return Result.success();
    }


    /**
     * 修改分类
     * @param categoryAdminDTO
     * @return
     */
    @ApiOperation(value = "修改分类")
    @PostMapping("/update")
    public Result updateCategory(@Validated @RequestBody CategoryAdminDTO categoryAdminDTO) {
        categoryAdminService.updateCategory(categoryAdminDTO);
        return Result.success();
    }


}
