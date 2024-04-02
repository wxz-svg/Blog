package com.wxz.common.constant;

/**
 * HTTP状态码常量
 */

public final class HttpStatusCodeConstants {

    private HttpStatusCodeConstants() {
        // 防止实例化
    }

    /**
     * HTTP状态码：100 - Continue，客户端应当继续发送请求。
     */
    public static final int STATUS_100_CONTINUE = 100;

    /**
     * HTTP状态码：101 - Switching Protocols，服务器将遵从客户的协议切换请求。
     */
    public static final int STATUS_101_SWITCHING_PROTOCOLS = 101;

    /**
     * HTTP状态码：200 - OK，请求已成功处理。
     */
    public static final int STATUS_200_OK = 200;

    /**
     * HTTP状态码：201 - Created，请求已被成功创建（通常用于POST请求）。
     */
    public static final int STATUS_201_CREATED = 201;

    /**
     * HTTP状态码：202 - Accepted，已接受请求，但未处理完成。
     */
    public static final int STATUS_202_ACCEPTED = 202;

    /**
     * HTTP状态码：204 - No Content，请求已成功处理，但没有返回内容。
     */
    public static final int STATUS_204_NO_CONTENT = 204;

    /**
     * HTTP状态码：301 - Moved Permanently，永久重定向。
     */
    public static final int STATUS_301_MOVED_PERMANENTLY = 301;

    /**
     * HTTP状态码：302 - Found，临时重定向。
     */
    public static final int STATUS_302_FOUND = 302;

    /**
     * HTTP状态码：304 - Not Modified，资源未被修改，可使用缓存版本。
     */
    public static final int STATUS_304_NOT_MODIFIED = 304;

    /**
     * HTTP状态码：400 - Bad Request，客户端请求有误。
     */
    public static final int STATUS_400_BAD_REQUEST = 400;

    /**
     * HTTP状态码：401 - Unauthorized，需要身份验证。
     */
    public static final int STATUS_401_UNAUTHORIZED = 401;

    /**
     * HTTP状态码：403 - Forbidden，服务器理解请求，但拒绝执行。
     */
    public static final int STATUS_403_FORBIDDEN = 403;

    /**
     * HTTP状态码：404 - Not Found，服务器找不到请求的资源。
     */
    public static final int STATUS_404_NOT_FOUND = 404;

    /**
     * HTTP状态码：500 - Internal Server Error，服务器遇到了意外情况，无法完成请求。
     */
    public static final int STATUS_500_INTERNAL_SERVER_ERROR = 500;

    /**
     * HTTP状态码：503 - Service Unavailable，服务器当前无法处理请求。
     */
    public static final int STATUS_503_SERVICE_UNAVAILABLE = 503;
}

