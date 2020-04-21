package com.floatcloud.chatroom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Float
 * @PropertySource 引入资源配置
 */
@PropertySource(value = {"classpath:/sysUser.properties"})
@SpringBootApplication
@MapperScan(basePackages = "com.floatcloud.chatroom.dao")
public class ChatRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatRoomApplication.class, args);
    }

}
