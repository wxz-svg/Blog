package com.wxz.web.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("好友列表")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FriendsVO {

    @ApiModelProperty("好友ID")
    private Integer id;


    @ApiModelProperty("好友用户名")
    private String username;



}
