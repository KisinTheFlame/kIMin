package tech.kisin.kimin.dto;

import java.util.Objects;

public class Result<T> {
    private int code;
    private String message;
    private T content;
    public Result(Code code, T content) {
        Objects.requireNonNull(code, "Result.code cannot be null.");
        this.code = code.getCode();
        this.message = code.getMessage();
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public enum Code {
        /* 一般性成功状态码 */
        SUCCESS(200, "成功"),
        /* 一般性失败状态码 */
        FAILURE(400, "错误"),
        /* 1000-1999：参数相关 */
        PARAM_IS_INVALID(1000, "参数无效"),
        PARAM_IS_BLANK(1001, "参数为空"),
        PARAM_TYPE_BIND_ERROR(1002, "参数类型错误"),
        PARAM_INCOMPLETE(1003, "参数缺失"),
        /* 2000-2999：用户相关 */
        USER_NOT_LOGGED_IN(2000, "未登录"),
        USER_HAS_LOGGED_IN(2001, "已登录"),
        USER_FORBIDDEN(2002, "权限不足"),
        USER_NONEXISTENT(2003, "用户名不存在"),
        USER_USERNAME_EXISTING(2004, "用户名已存在"),
        USER_USERNAME_MISSING(2005, "请输入用户名"),
        USER_PASSWORD_INCORRECT(2006, "密码不正确"),
        USER_PASSWORD_MISSING(2007, "请输入密码"),
        USER_TOKEN_INVALID(2008, "登录凭证无效");

        private final int code;
        private final String message;

        Code(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
