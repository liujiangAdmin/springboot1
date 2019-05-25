package com.liujiang.util.exception;

/**
 * 接口异常统一处理
 */
public class InterfaceException extends RuntimeException{

    private Integer code;
    private String msg;
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public InterfaceException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
