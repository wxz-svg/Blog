package com.wxz.web.domain.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 评论Request
 *
 * @author ican
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "评论Request")
public class CommentDTO {

    /**
     * 类型id
     */
    @NotNull(message = "类型id不能为空")
    @Null(message = "类型id必须为空")
    @ApiModelProperty(value = "类型id", required = true)
    private Integer typeId;

    /**
     * 评论类型 (1文章 2友链 3说说)
     */
    @NotNull(message = "评论类型不能为空")
    @ApiModelProperty(value = "评论类型 (1文章 3说说)", required = true)
    private Integer commentType;

    /**
     * 父评论id
     */
    @ApiModelProperty(value = "父评论id", required = true)
    private Integer parentId;

    /**
     * 被回复评论id
     */
    @Null(message = "reply_id、to_uid必须都为空")
    @NotNull(message = "回复评论id和回复用户id不能为空")
    @ApiModelProperty(value = "被回复评论id", required = true)
    private Integer replyId;

    /**
     * 被回复用户id
     */
    @Null(message = "reply_id、to_uid必须都为空")
    @NotNull(message = "回复评论id和回复用户id不能为空")
    @ApiModelProperty(value = "被回复用户id", required = true)
    private Integer toUid;

    /**
     * 评论内容
     */
    @NotBlank(message = "评论内容不能为空")
    @ApiModelProperty(value = "评论内容", required = true)
    private String commentContent;

}
