package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Chat;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{
   @Autowired
    ChatRepository chatRepository;
   @Autowired
   UserServiceImpl userService;
    @Override
    public Chat createChat(Integer userId1, Integer userId2) throws Exception {
        User user1 = userService.findUserById(userId1);
        User user2=userService.findUserById(userId2);
           Chat chat = chatRepository.findChatByUsersId(user1,user2);
           if(chat!=null){
               return chat;
           }
           Chat newChat = new Chat();
           newChat.getUsers().add(user1);
           newChat.getUsers().add(user2);
           newChat.setTime(LocalDateTime.now());
           return chatRepository.save(newChat);
    }

    @Override
    public List<Chat> findUserChats(Integer id) {
          return chatRepository.findByUsersId(id);
    }
}
