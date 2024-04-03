package com.wxz.admin.service.impl;

import com.wxz.admin.mapper.FriendsAdminMapper;
import com.wxz.admin.service.FriendsAdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class FriendsAdminServiceImpl implements FriendsAdminService {

    @Autowired
    private FriendsAdminMapper friendsAdminMapper;
}
