package com.wxz.common.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusCodeEnum {

    /**
     * 成功状态码，一般对应HTTP 200
     */
    SUCCESS(200, "操作成功"),

    /**
     * 失败状态码，一般对应HTTP 500
     */
    FAILURE(500, "系统错误"),

    /**
     * 未授权状态码，一般对应HTTP 401
     */
    UNAUTHORIZED(401, "未授权"),

    /**
     * 资源未找到状态码，一般对应HTTP 404
     */
    NOT_FOUND(404, "资源未找到"),

    /**
     * 请求参数错误状态码，一般对应HTTP 400
     */
    BAD_REQUEST(400, "请求参数错误");

    private final int code;
    private final String message;
}
