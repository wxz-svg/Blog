package com.wxz.web.service.impl;

import com.wxz.web.mapper.CommentWebMapper;
import com.wxz.web.service.CommentWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评论管理
 */
@Service
@Slf4j
public class CommentWebServiceImpl implements CommentWebService {

    @Autowired
    private CommentWebMapper commentWebMapper;


}
