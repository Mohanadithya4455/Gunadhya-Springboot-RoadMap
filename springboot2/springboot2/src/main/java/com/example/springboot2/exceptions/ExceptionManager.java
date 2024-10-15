package com.example.springboot2.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionManager {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> methodArgumentExceptionHandler(MethodArgumentNotValidException error){
        Map<String,String> map = new HashMap<>();
        error.getBindingResult().getAllErrors().forEach(err->{
            String k = ((FieldError)err).getField();
            String message = err.getDefaultMessage();
            map.put(k,message);
        });
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }
}
