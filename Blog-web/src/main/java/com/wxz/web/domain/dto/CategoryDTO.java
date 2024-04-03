package com.wxz.web.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


/**
 * 分类
 *
 * @author ican
 */
@Data
@ApiModel(description = "前台分类")
public class CategoryDTO {

    /**
     * 分类id
     */
    @ApiModelProperty(value = "分类id")
    private Integer id;

    /**
     * 分类名
     */
    @NotBlank(message = "分类名不能为空")
    @ApiModelProperty(value = "分类名", required = true)
    private String categoryName;

}