package com.floatcloud.chatroom.config;

import com.floatcloud.chatroom.component.SysLocaleResolve;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
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
        // 配置静态资源目录

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 添加请求映射到指定视图
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
    }

    /**
     * 区域信息解析器组件注册
     * @return sysLocaleResolve 自定义区域信息解析器
     */
    @Bean
    public LocaleResolver localeResolve(){
        return new SysLocaleResolve();
    }
}
