package com.wxz.web.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * 登录信息
 **/
@Data
@ApiModel(description = "登录信息Request")
public class LoginDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    /**
     * 用户密码
     */
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, message = "密码不能少于6位")
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;

}
