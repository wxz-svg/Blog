package com.wxz.web.controller;

import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;
import com.wxz.web.domain.dto.CommentDTO;
import com.wxz.web.domain.vo.CommentVO;
import com.wxz.web.domain.vo.ReplyVO;
import com.wxz.web.service.CommentWebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "前台评论接口")
@RestController
@RequestMapping("/home/comment")
public class CommentWebController {

    @Autowired
    private CommentWebService commentWebService;

    /**
     * 发布评论
     */
    public Result<?> addComment(@Valid @RequestBody CommentDTO commentDTO) {
        commentWebService.addComment(commentDTO);
        return Result.success();
    }

    /**
     * 获取文章下的评论列表
     */
    @ApiOperation(value = "查看评论列表")
    @GetMapping("/list/{articleId}")
    public Result<PageResult<CommentVO>> listCommentVO(@PathVariable("articleId") Integer articleId) {
        return Result.success(commentWebService.listArticleComment(articleId));
    }

    /**
     * 查看回复评论(应该是系统自动通知)
     *
     */
    @ApiOperation(value = "查看回复评论")
    @GetMapping("/comment/{commentId}/reply")
    public Result<List<ReplyVO>> listReply(@PathVariable("commentId") Integer commentId) {
        return Result.success(commentWebService.listReply(commentId));
    }


    /**
     *删除评论
     */



    /**
     * 更新评论内容
     */
}
