package com.floatcloud.chatroom.dao;

import com.floatcloud.chatroom.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author Float
 * JDK代理模式的实现
 */
@Mapper
@Component
public interface UserMapper {

    @Insert(value = "insert into t_user(username,loginName,userId,password,email,phone) " +
            "values (#{username},#{loginName},#{userId},#{password},#{email},#{phone})")
    int insert(UserInfo userInfo);

    /**
     * @param loginName 登录名
     * @return 返回UserInfo对象
     */
    @Select("select from t_user where login_name = #{loginName}")
    UserInfo getUserInfoByLoginName(String loginName);
}
