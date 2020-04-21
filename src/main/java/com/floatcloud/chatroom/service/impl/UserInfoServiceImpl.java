package com.floatcloud.chatroom.service.impl;

import com.floatcloud.chatroom.dao.UserMapper;
import com.floatcloud.chatroom.entity.UserInfo;
import com.floatcloud.chatroom.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Float
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(UserInfo userInfo) {
        return userMapper.insert(userInfo);
    }

    @Override
    public UserInfo getUserInfoByLoginName(String loginName) {
        return userMapper.getUserInfoByLoginName(loginName);
    }
}
