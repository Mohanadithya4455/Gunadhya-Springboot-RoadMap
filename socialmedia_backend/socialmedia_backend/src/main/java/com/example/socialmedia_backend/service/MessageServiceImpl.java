package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Chat;
import com.example.socialmedia_backend.models.Message;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.repositories.ChatRepository;
import com.example.socialmedia_backend.repositories.MessageRepository;
import com.example.socialmedia_backend.responses.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    ChatServiceImpl chatService;
    @Autowired
    ChatRepository chatRepository;
    @Override
    public Message createMessage(MessageRequest request, Integer chatId, User user) throws Exception {
        Chat chat = chatService.findById(chatId);
        Message message = new Message();
        message.setChat(chat);
        message.setUser(user);
        message.setContent(request.getContent());
        message.setImages(request.getImages());
        message.setTimestamp(LocalDateTime.now());
        chat.getMessages().add(message);
        chatRepository.save(chat);
        return messageRepository.save(message);

    }



    @Override
    public List<Message> findMessagesByChatId(Integer chatId) {
        return messageRepository.findByChatId(chatId);
    }
}
