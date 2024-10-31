package com.example.ProductAndCategory.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionManagement extends Exception{

     @ExceptionHandler
      public ResponseEntity<Map<String,String>> MethodArgumentNotValidException(MethodArgumentNotValidException error){
          Map<String,String> map = new HashMap<>();
          error.getBindingResult().getAllErrors().forEach(
                  err->{
                      String str=((FieldError)err).getField();
                      String message=err.getDefaultMessage();
                      map.put(str,message);
                  }

          );
          return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
      }
}
