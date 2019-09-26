package com.floatcloud.chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Float
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(){
        return "";
    }

    @RequestMapping({"/","/login"})
    public String index(){
        return "login";
    }
}
