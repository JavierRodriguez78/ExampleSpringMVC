package com.geekshubsacademy.demomvcthymeleaf.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptcionController {

    @ExceptionHandler(Exception.class)
    public String showInternalServerError()
    {
        return "error/500";
    }
}
