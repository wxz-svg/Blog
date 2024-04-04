package com.wxz.web.service;

import com.wxz.common.pojo.PageResult;
import com.wxz.web.domain.dto.CommentDTO;
import com.wxz.web.domain.vo.CommentVO;
import com.wxz.web.domain.vo.ReplyVO;

import java.util.List;

public interface CommentWebService {

    /**
     * 添加评论
     * @param commentDTO
     */
    void addComment(CommentDTO commentDTO);

    /**
     * 查询文章的评论列表
     * @param articleId
     * @return
     */
    PageResult<CommentVO> listArticleComment(Integer articleId);


    /**
     * 查询评论的回复列表
     * @param commentId
     * @return
     */
    List<ReplyVO> listReply(Integer commentId);
}
