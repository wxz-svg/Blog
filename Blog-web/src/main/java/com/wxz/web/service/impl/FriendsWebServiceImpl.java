package com.wxz.web.service.impl;

import com.wxz.web.mapper.FriendsWebMapper;
import com.wxz.web.service.FriendsWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FriendsWebServiceImpl implements FriendsWebService {

    @Autowired
    private FriendsWebMapper friendsWebMapper;



}
