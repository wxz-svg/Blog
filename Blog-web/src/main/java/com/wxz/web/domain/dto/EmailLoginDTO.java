package com.wxz.web.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("邮箱登录参数")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailLoginDTO {

    @ApiModelProperty("邮箱")
    @NotBlank(message = "邮箱不能为空")
    String email;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    @Max(value = 20, message = "密码长度不能超过20")
    @Min(value = 6, message = "密码长度不能小于6")
    String password;
}
