package com.wxz.admin.service;

import com.wxz.admin.domain.dto.UserAdminDTO;
import com.wxz.admin.domain.vo.UserAdminVO;
import com.wxz.common.pojo.PageResult;
import com.wxz.common.pojo.Result;

public interface UserAdminService {

    /**
     * 获取用户列表
     * @return
     */
    Result<PageResult<UserAdminVO>> getUserList();

    void addUser(UserAdminDTO userAdminDTO);

    void updateUser(UserAdminDTO userAdminDTO);

    void deleteUser(UserAdminDTO userAdminDTO);
}
