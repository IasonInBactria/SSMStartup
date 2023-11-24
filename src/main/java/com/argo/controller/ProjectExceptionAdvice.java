package com.argo.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("发生异常！");
        return new Result(666, null, "发生异常！");
    }
}
