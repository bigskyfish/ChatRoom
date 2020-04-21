package com.floatcloud.chatroom.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


/**
 * @author Float
 * @Validated 开启数据校验
 */
@Component
@Getter
@Setter
@ToString
@Validated
public class UserInfo {

    @NotBlank
    private String username;

    @NotBlank
    private String loginName;

    @NotBlank
    private int userId;

    @NotBlank
    private String password;

    @Email
    private String email;

    @Pattern(regexp = "^\\d{11}$")
    private String phone;

}
