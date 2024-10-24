package com.example.employeebackend.exceptions;

public class AlreadyExistsException extends RuntimeException{
    public AlreadyExistsException(String str){
        super(str);
    }

}
