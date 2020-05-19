package com.swadian.userdemo.service.serviceImpl;

import com.swadian.userdemo.entity.User;
import com.swadian.userdemo.mapper.UserMapper;
import com.swadian.userdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/7/6/006 20:22
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectUserInfo(User user) {
        return userMapper.selectUserInfo(user);
    }

    @Override
    public int insertUserInfo(User user) {
        return userMapper.insertUserInfo(user);
    }

    @Override
    public int updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }

    @Override
    public int deleteUserInfoById(String userId) {
        return userMapper.deleteUserInfoById(userId);
    }
}
