package com.floatcloud.chatroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 系统SpringMVC的特殊配置
 * WebMvcRegistrationsAdapter和WebMvcConfigurerAdapter
 * 在springBoot2.0版本以后过时，但是其接口仍然可用，即不能使用其适配器（抽象类）。
 * @author Float
 */
@Configuration
public class SysMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // registry.addViewController("/").setViewName("login");
    }
}
