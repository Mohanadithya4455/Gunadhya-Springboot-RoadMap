package com.example.socialmedia_backend.controller;

import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.service.UserService;
import com.example.socialmedia_backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;
    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userServiceImpl.saveUser(user);
    }
    @GetMapping("/api/getall")
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }
    @GetMapping("/api/get/{id}")
    public User getById(@PathVariable("id") Integer id) throws Exception {
        return userServiceImpl.findUserById(id);
    }
    @PutMapping("/api/update/{id}")
    public User updateUser(@PathVariable("id") Integer id,@RequestBody User user) throws Exception {
       return userServiceImpl.updateUser(id, user);
    }
    @DeleteMapping("/api/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) throws Exception {
        return userServiceImpl.deleteUser(id);
    }
    @PutMapping("/apifollow/{id1}/{id2}")
    public User followUser(@PathVariable("id1") Integer id1,@PathVariable("id2") Integer id2) throws Exception {
        return userServiceImpl.followUser(id1,id2);
    }

    @GetMapping("/api/search/{mailId}")
    public User getByMail(@PathVariable("mailId") String mail){
        return userServiceImpl.searchByEmail(mail);
    }
    @GetMapping("/api/searchUser")
    public List<User> searchUser(@RequestParam("query") String name){
        return userServiceImpl.searchUser(name);
    }
}
