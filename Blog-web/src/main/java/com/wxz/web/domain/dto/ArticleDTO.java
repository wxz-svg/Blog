package com.wxz.web.domain.dto;

import com.wxz.common.entity.Tag;
import com.wxz.common.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@ApiModel(description = "前台文章DTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleDTO {

    @ApiModelProperty(value = "文章id")
    private Integer id;

    @ApiModelProperty(value = "文章封面")
    private String articleCover;

    @ApiModelProperty(value = "文章标题")
    private String articleTitle;

    @ApiModelProperty(value = "文章内容")
    private String articleContent;

    @ApiModelProperty(value = "是否置顶（0否，1是）")
    private Integer isTop;

    @ApiModelProperty(value = "是否推荐（0否，1是）")
    private Integer isFeatured;

    @ApiModelProperty(value = "文章作者")
    private User author;

    @ApiModelProperty(value = "文章分类名称")
    private String categoryName;

    @ApiModelProperty(value = "文章标签列表")
    private List<Tag> tags;

    @ApiModelProperty(value = "文章状态（0已发布，1草稿）")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

}
