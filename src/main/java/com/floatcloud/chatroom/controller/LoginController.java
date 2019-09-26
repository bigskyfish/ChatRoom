package com.floatcloud.chatroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Float
 */
@Controller
public class LoginController {

    @PostMapping(value="/chat")
    public String login(){
        return "chatroom/chat";
    }
}
