package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.Post;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.repositories.PostRepository;
import com.example.socialmedia_backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;
    @Autowired
    UserServiceImpl userServiceImpl;
    @Autowired
    UserRepository userRepository;
    @Override
    public Post createPost(Integer userId, Post post) throws Exception {
        User user = userServiceImpl.findUserById(userId);
        Post newPost = new Post();
        newPost.setId(post.getId());
        newPost.setUser(user);
        newPost.setImage(post.getImage());
        newPost.setVideo(post.getVideo());
        newPost.setCaption(post.getCaption());
        newPost.setCreatedAt(LocalDateTime.now());
        postRepository.save(newPost);
        return newPost;
    }

    @Override
    public String deletePost(Integer userId, Integer postId) throws Exception {
        User user = userServiceImpl.findUserById(userId);
        Post post = findPostById(postId);
        postRepository.delete(post);
        return "Post deleted successfully";
    }

    @Override
    public List<Post> findPostsByUserId(Integer userId) throws Exception {
         User user = userServiceImpl.findUserById(userId);
         return postRepository.findByUser(user);
    }

    @Override
    public Post findPostById(Integer postId) throws Exception {
        Optional<Post> post = postRepository.findById(postId);
        if(post.isPresent()){
            return post.get();
        }
        throw new Exception("Post not found with this id; "+postId);
    }

    @Override
    public List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(Integer userId, Integer postId) throws Exception {
       User user = userServiceImpl.findUserById(userId);
       Post post = findPostById(postId);
       if(!user.getSavedPosts().contains(post))
       user.getSavedPosts().add(post);
       else user.getSavedPosts().remove(post);
       userRepository.save(user);
       return post;

    }



    @Override
    public Post likePost(Integer userId, Integer postId) throws Exception {
        User user = userServiceImpl.findUserById(userId);
        Post post = findPostById(postId);
        if(!post.getLikes().contains(user))
        post.getLikes().add(user);
        else post.getLikes().remove(user);
        return postRepository.save(post);
    }
}
