package com.wxz.common.pojo;

import com.wxz.common.enums.StatusCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.ResourceBundle;

import static com.wxz.common.enums.StatusCodeEnum.FAILURE;
import static com.wxz.common.enums.StatusCodeEnum.SUCCESS;

// 结果返回类，用于API调用的结果封装
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "结果返回类")
public class Result<T> {

    private static final ResourceBundle messages = ResourceBundle.getBundle("result_messages"); // 国际化消息资源包

    /**
     * 返回状态，true表示成功，false表示失败
     */
    @ApiModelProperty(value = "返回状态")
    private boolean flag;

    /**
     * 状态码，对应具体的成功或失败代码
     */
    @ApiModelProperty(value = "状态码")
    private Integer code;

    /**
     * 返回信息，描述操作结果的详细信息
     */
    @ApiModelProperty(value = "返回信息")
    private String message;

    /**
     * 返回数据，调用成功时返回的具体数据
     */
    @ApiModelProperty(value = "返回数据")
    private T data;

    /**
     * 生成一个表示成功的结果对象
     * @return 返回一个空数据的成功结果
     */
    public static <T> Result<T> success() {
        return result(true, SUCCESS.getCode(), SUCCESS.getMessage(), null);
    }

    /**
     * 生成一个表示成功的结果对象，包含数据
     * @param data 成功时返回的数据
     * @return 返回包含数据的成功结果
     */
    public static <T> Result<T> success(T data) {
        return result(true, SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    /**
     * 生成一个自定义状态码和消息的错误结果对象
     * @param code 自定义的状态码
     * @param message 自定义的错误消息
     * @return 返回一个指定状态码和消息的错误结果
     */
    public static <T> Result<T> fail(Integer code, String message) {
        return result(false, code, message, null);
    }

    /**
     * 生成一个表示失败的结果对象，使用通用失败消息
     * @param message 失败时的通用消息
     * @return 返回一个通用失败消息的结果
     */
    public static <T> Result<T> fail(String message) {
        return result(false, FAILURE.getCode(), message, null);
    }

    /**
     * 根据给定参数构建一个结果对象，不包含数据
     * @param flag 操作状态
     * @param message 操作消息
     * @return 返回一个根据给定参数构建的结果对象
     */
    private static <T> Result<T> result(Boolean flag, String message) {
        return Result.<T>builder()
                .flag(flag)
                .message(message)
                .build();
    }

    /**
     * 根据给定参数构建一个结果对象，包含数据
     * @param flag 操作状态
     * @param code 状态码
     * @param message 操作消息
     * @param data 操作结果数据
     * @return 返回一个根据给定参数构建的结果对象，包含数据
     */
    private static <T> Result<T> result(boolean flag, Integer code, String message, T data) {
        return Result.<T>builder()
                .flag(flag)
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
}
