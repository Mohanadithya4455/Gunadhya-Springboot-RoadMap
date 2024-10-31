package com.example.socialmedia_backend.controller;


import com.example.socialmedia_backend.models.Message;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.responses.MessageRequest;
import com.example.socialmedia_backend.service.MessageServiceImpl;
import com.example.socialmedia_backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    MessageServiceImpl messageService;
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/save/{chatId}")
    public Message createMessage(@RequestHeader("Authorization") String jwt, @PathVariable("chatId") Integer chatId
    , @RequestBody MessageRequest request) throws Exception {
        User user = userService.getUserByToken(jwt);
        return messageService.createMessage(request,chatId,user);
    }

    public List<Message> findMessagesByChatId(@RequestHeader("Authorization") String jwt, @PathVariable("chatId") Integer chatId){
        User user = userService.getUserByToken(jwt);
        return  messageService.findMessagesByChatId(chatId);
    }
}
