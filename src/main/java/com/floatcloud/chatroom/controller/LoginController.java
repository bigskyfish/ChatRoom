package com.floatcloud.chatroom.controller;

import com.floatcloud.chatroom.entity.UserInfo;
import com.floatcloud.chatroom.service.impl.UserInfoServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Float
 */
@Controller
public class LoginController {

    @Resource
    private UserInfoServiceImpl userInfoService;

    @PostMapping(value="/chat")
    public String index(){
        return "chatroom/chat";
    }


    @PostMapping(value = "/login")
    public String login(HttpServletRequest httpServletRequest, @Param("loginName")String loginName, @Param("password") String password){
        UserInfo userInfo = userInfoService.getUserInfoByLoginName(loginName);
        HttpSession httpSession = httpServletRequest.getSession();
        if(userInfo != null){
            String userIdStr = "user_" + userInfo.getUserId();
            Object objUser = httpSession.getAttribute(userIdStr);
            if (objUser != null){
                // 这里存储userInfo对象有待商榷
                httpSession.setAttribute(userIdStr,userInfo);
            }
            return "chatroom/chat";
        } else {
            return "errors/404";
        }

    }

}
