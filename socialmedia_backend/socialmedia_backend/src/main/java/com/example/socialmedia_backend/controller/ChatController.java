package com.example.socialmedia_backend.controller;


import com.example.socialmedia_backend.models.Chat;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.service.ChatService;
import com.example.socialmedia_backend.service.ChatServiceImpl;
import com.example.socialmedia_backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chats")
public class ChatController {
    @Autowired
    ChatServiceImpl chatService;
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/create/{id2}")
    public Chat createChat(@RequestHeader("Authorization") String jwt, @PathVariable("id2") Integer id2) throws Exception {
        User user = userService.getUserByToken(jwt);
        return chatService.createChat(user.getId(),id2);
    }
    @GetMapping("/getall")
    public List<Chat> findUsersChats(@RequestHeader("Authorization") String jwt){
        User user = userService.getUserByToken(jwt);
        return chatService.findUserChats(user.getId());
    }

}
