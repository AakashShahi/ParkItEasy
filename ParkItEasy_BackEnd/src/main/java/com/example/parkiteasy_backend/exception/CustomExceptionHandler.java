package com.example.parkiteasy_backend.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class CustomExceptionHandler {
    @ExceptionHandler({Exception.class})
    public String handleAll(Exception ex, final WebRequest request) {
        return ex.getMessage();
    }
}
