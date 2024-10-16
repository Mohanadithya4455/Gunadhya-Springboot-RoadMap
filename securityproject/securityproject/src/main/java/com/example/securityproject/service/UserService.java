package com.example.securityproject.service;

import com.example.securityproject.models.User;

import java.util.Optional;


public interface UserService {
    public User findByEmail(String email) throws Exception;
    public User getUserByJwt(String jwt) throws Exception;
}
