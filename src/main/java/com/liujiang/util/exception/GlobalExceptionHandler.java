package com.liujiang.util.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一处理InterfaceException
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = InterfaceException.class)
    @ResponseBody
    public String errorHandler(InterfaceException e) {
        return "global error:" + e.getClass().getName();
    }
}
