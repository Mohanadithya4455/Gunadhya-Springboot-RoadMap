package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Chat;

import java.util.List;

public interface ChatService {
    public Chat createChat(Integer userId1,Integer userId2) throws Exception;
    public List<Chat> findUserChats(Integer id);
    public Chat findById(Integer chatId) throws Exception;

}
