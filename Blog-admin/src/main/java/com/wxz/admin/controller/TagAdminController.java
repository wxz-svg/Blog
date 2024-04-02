package com.wxz.admin.controller;

import com.wxz.admin.domain.dto.TagBackDTO;
import com.wxz.admin.service.TagAdminService;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/tag")
@Api(tags = "后台标签相关接口")
public class TagAdminController {

    @Autowired
    private TagAdminService tagAdminService;

    /**
     * 获得后台标签
     * @return
     */
    @ApiOperation("获得后台标签")
    @GetMapping("/list")
    public Result<PageResult<TagBackDTO>> getListTags() {
        return Result.success(tagAdminService.getListTags());
    }


    /**
     * 添加标签
     * @param tagBackDTO
     * @return
     */
    @ApiOperation("添加标签")
    @GetMapping("/add")
    public Result<TagBackDTO> addTags(@Validated @RequestBody TagBackDTO tagBackDTO){
        tagAdminService.addTags(tagBackDTO);
        return Result.success();
    }

    /**
     * 删除标签
     * @param tagIdList
     * @return
     */
    @ApiOperation("删除标签")
    @GetMapping("/delete")
    public Result<TagBackDTO> deleteTags(@RequestBody List<Integer> tagIdList){
        tagAdminService.deleteTags(tagIdList);
        return Result.success();
    }


    /**
     * 搜索标签
     * @param keywords
     * @return
     */
    @ApiOperation(value = "搜索文章标签")
    @GetMapping("/search")
    public Result<List<TagBackDTO>> listTagsAdminBySearch(String keywords) {
        return Result.success(tagAdminService.listTagsAdminBySearch(keywords));
    }

    /**
     * 修改标签
     * @param tag
     * @return
     */
    @ApiOperation(value = "修改标签")
    @PutMapping("/admin/tag/update")
    public Result<?> updateTag(@Validated @RequestBody TagBackDTO tag) {
        tagAdminService.updateTags(tag);
        return Result.success();
    }


}
