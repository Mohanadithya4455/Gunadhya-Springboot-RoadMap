package com.example.socialmedia_backend.repositories;

import com.example.socialmedia_backend.models.Post;
import com.example.socialmedia_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    List<Post> findByUser(User user);
}
