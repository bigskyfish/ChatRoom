package com.floatcloud.chatroom.service;

import com.floatcloud.chatroom.entity.UserInfo;

/**
 * @author Float
 */
public interface UserInfoService {

    int insertUser(UserInfo userInfo);

    UserInfo getUserInfoByLoginName(String loginName);
}
