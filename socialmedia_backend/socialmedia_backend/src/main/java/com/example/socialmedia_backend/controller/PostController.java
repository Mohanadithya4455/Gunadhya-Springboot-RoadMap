package com.example.socialmedia_backend.controller;

import com.example.socialmedia_backend.models.Post;
import com.example.socialmedia_backend.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    @Autowired
    PostServiceImpl postService;

    @PostMapping("/save/{id}")
    public ResponseEntity<Post> CreatePost(@RequestBody Post post, @PathVariable("id") Integer id) throws Exception {
        Post post1 =  postService.createPost(id,post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{userId}/{postId}")
    public ResponseEntity<String> deletPost(@PathVariable("userId") Integer userId,@PathVariable("postId") Integer postId) throws Exception {
        String str = postService.deletePost(userId, postId);
        return  new ResponseEntity<>(str,HttpStatus.OK);

    }
    @GetMapping("/getUserPosts/{userId}")
    public ResponseEntity<List<Post>> findUserPosts(@PathVariable("userId") Integer id) throws Exception {
        List<Post> posts = postService.findPostsByUserId(id);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }
    @GetMapping("/getPost/{id}")
    public ResponseEntity<Post> findPostById(@PathVariable("id") Integer id) throws Exception {
        Post post = postService.findPostById(id);
        return new ResponseEntity<>(post,HttpStatus.OK);
    }
    @GetMapping("/getAllPosts")
    public ResponseEntity<List<Post>> findAllPosts(){
        List<Post> posts = postService.findAllPosts();
        return  new ResponseEntity<>(posts,HttpStatus.OK);
    }
    @PutMapping("/savePost/{userId}/{postId}")
    public ResponseEntity<Post> savePost(@PathVariable("userId") Integer userId,@PathVariable("postId") Integer postId) throws Exception {
        Post post = postService.savePost(userId,postId);
        return new ResponseEntity<>(post,HttpStatus.ACCEPTED);
    }
    @PutMapping("/likePost/{userId}/{postId}")
    public ResponseEntity<Post> likePost(@PathVariable("userId") Integer userId,@PathVariable("postId") Integer postId) throws Exception {
        Post post = postService.likePost(userId,postId);
        return new ResponseEntity<>(post,HttpStatus.ACCEPTED);
    }
}
