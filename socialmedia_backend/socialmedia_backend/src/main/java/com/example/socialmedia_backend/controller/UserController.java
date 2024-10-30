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

    @GetMapping("/api/getall")
    public List<User> getAllUsers(@RequestHeader("Authorization") String jwt){
        User user = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.getAllUsers();
    }
    @GetMapping("/api/get/{id}")
    public User getById(@PathVariable("id") Integer id,@RequestHeader("Authorization") String jwt) throws Exception {
        User user = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.findUserById(id);
    }
    @PutMapping("/api/update")
    public User updateUser(@RequestBody User user, @RequestHeader("Authorization") String jwt) throws Exception {
        User user1 = userServiceImpl.getUserByToken(jwt);
       return userServiceImpl.updateUser(user1.getId(),user);
    }
    @DeleteMapping("/api/delete")
    public String deleteUser(@RequestHeader("Authorization") String jwt) throws Exception {
        User user1 = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.deleteUser(user1.getId());
    }
    @PutMapping("/api/follow/{id2}")
    public User followUser(@RequestHeader("Authorization") String jwt,@PathVariable("id2") Integer id2) throws Exception {
        User user1 = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.followUser(user1.getId(),id2);
    }

    @GetMapping("/api/search/{mailId}")
    public User getByMail(@PathVariable("mailId") String mail,@RequestHeader("Authorization") String jwt){
        User user1 = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.searchByEmail(mail);
    }
    @GetMapping("/api/searchUser")
    public List<User> searchUser(@RequestParam("query") String name,@RequestHeader("Authorization") String jwt){
        User user1 = userServiceImpl.getUserByToken(jwt);
        return userServiceImpl.searchUser(name);
    }
}
