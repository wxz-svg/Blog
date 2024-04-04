package com.wxz.web.service;

import com.wxz.common.pojo.Result;
import com.wxz.web.domain.vo.FriendsVO;

import java.util.List;

public interface FriendsWebService {

    /**
     * 获取当前用户的粉丝列表
     * @return
     */
    Result<List<FriendsVO>> getFansList();

    /**
     * 获取当前用户的关注列表
     * @return
     */
    Result<List<FriendsVO>> getFollowList();
}
