package com.wxz.web.service.impl;

import com.wxz.common.pojo.Result;
import com.wxz.web.domain.vo.FriendsVO;
import com.wxz.web.mapper.FriendsWebMapper;
import com.wxz.web.service.FriendsWebService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FriendsWebServiceImpl implements FriendsWebService {

    @Autowired
    private FriendsWebMapper friendsWebMapper;


    /**
     * 获取当前用户的粉丝列表
     * @return
     */
    @Override
    public Result<List<FriendsVO>> getFansList() {
        return null;
    }

    /**
     * 获取当前用户的关注列表
     * @return
     */
    @Override
    public Result<List<FriendsVO>> getFollowList() {
        return null;
    }
}
