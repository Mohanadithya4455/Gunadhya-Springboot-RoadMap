package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User findUserById(Integer id) throws Exception;
    User updateUser(Integer id, User user) throws Exception;
    String deleteUser(Integer id) throws Exception;
    User followUser(Integer userId1, Integer userId2) throws Exception;
    User searchByEmail(String email);
    List<User> searchUser(String name);

}
