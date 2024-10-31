package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Message;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.responses.MessageRequest;

import java.util.List;

public interface MessageService {
    public Message createMessage(MessageRequest request, Integer ChatId, User user) throws Exception;

    public List<Message> findMessagesByChatId(Integer chatId);

}
