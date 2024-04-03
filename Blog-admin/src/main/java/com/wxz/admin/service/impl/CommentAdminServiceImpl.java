package com.wxz.admin.service.impl;

import com.wxz.admin.mapper.CommentAdminMapper;
import com.wxz.admin.service.CommentAdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentAdminServiceImpl implements CommentAdminService {

    @Autowired
    private CommentAdminMapper commentAdminMapper;

}
