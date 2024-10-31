package com.example.socialmedia_backend.repositories;

import com.example.socialmedia_backend.models.Chat;
import com.example.socialmedia_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat,Integer> {

    public List<Chat> findByUsersId(Integer id);
    @Query("select c from Chat c where :user1 Member of c.users And :user2 Member of c.users")
    public Chat findChatByUsersId(@Param("user1") User user1, @Param("user2") User user2);
}
