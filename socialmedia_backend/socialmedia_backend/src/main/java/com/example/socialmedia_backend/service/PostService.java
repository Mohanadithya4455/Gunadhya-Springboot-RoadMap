package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Post;

import java.util.List;

public interface PostService {
    Post createPost(Integer userId, Post post) throws Exception;
    String deletePost(Integer userId, Integer postId) throws Exception;
    List<Post> findPostsByUserId(Integer userId) throws Exception;
    Post findPostById(Integer postId) throws Exception;
    List<Post> findAllPosts();
    Post savePost(Integer userId, Integer postId) throws Exception;
    Post likePost(Integer userId, Integer postId) throws Exception;
}
