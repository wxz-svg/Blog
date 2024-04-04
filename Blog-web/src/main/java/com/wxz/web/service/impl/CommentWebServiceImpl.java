package com.wxz.web.service.impl;

import com.wxz.common.pojo.PageResult;
import com.wxz.web.domain.dto.CommentDTO;
import com.wxz.web.domain.vo.CommentVO;
import com.wxz.web.domain.vo.ReplyVO;
import com.wxz.web.mapper.CommentWebMapper;
import com.wxz.web.service.CommentWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论管理
 */
@Service
@Slf4j
public class CommentWebServiceImpl implements CommentWebService {

    @Autowired
    private CommentWebMapper commentWebMapper;


    /**
     * 添加评论
     * @param commentDTO
     */
    @Override
    public void addComment(CommentDTO commentDTO) {

    }

    /**
     * 查看文章下的评论列表
     * @param articleId
     * @return
     */
    @Override
    public PageResult<CommentVO> listArticleComment(Integer articleId) {
        return null;
    }

    /**
     * 前台用户的评论通知
     * @param commentId
     * @return
     */
    @Override
    public List<ReplyVO> listReply(Integer commentId) {
        return null;
    }
}
