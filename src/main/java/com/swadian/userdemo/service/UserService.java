package com.swadian.userdemo.service;

import com.swadian.userdemo.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 查询
     * @param user
     * @return
     */
    List<User> selectUserInfo(User user);

    /**
     * 增加
     * @param user
     * @return
     */
    int insertUserInfo(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    int updateUserInfo(User user);

    /**
     * 删除
     * @param userId
     * @return
     */
    int deleteUserInfoById(String userId);

}
