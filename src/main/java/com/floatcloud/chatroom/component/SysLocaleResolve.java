package com.floatcloud.chatroom.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Float
 * 区域信息解析器
 */
public class SysLocaleResolve implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("lg");
        Locale locale = null;
        if (StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            int lengthIndex = 2;
            if (split.length == lengthIndex){
                locale = new Locale(split[0],split[1]);
            }
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
