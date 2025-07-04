package com.example.productservice.controllerAdvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public void ExceptionHandler(Exception e){
        e.printStackTrace();
    }
}
