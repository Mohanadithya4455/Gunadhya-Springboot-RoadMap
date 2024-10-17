package com.example.socialmedia_backend.service;

import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User user1 = new User();
        user1.setId(user.getId());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        return userRepository.save(user1);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Integer id) throws Exception {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        throw new Exception("User not found with this id: "+id);
    }

    @Override
    public User updateUser(Integer id, User user) throws Exception {
        User isExist = findUserById(id);
        if(user.getFirstName()!=null){
            isExist.setFirstName(user.getFirstName());
        }
        if(user.getLastName()!=null){
            isExist.setLastName(user.getLastName());
        }
        if(user.getEmail()!=null){
            isExist.setEmail(user.getEmail());
        }
        return userRepository.save(isExist);
    }

    @Override
    public String deleteUser(Integer id) throws Exception {
        User user =findUserById(id);
        userRepository.delete(user);
        return "user successfully deleted";
    }

    @Override
    public User followUser(Integer userId1, Integer userId2) throws Exception {
     User user1 = findUserById(userId1);
     User user2 = findUserById(userId2);
     user1.getFollowings().add(userId2);
     user2.getFollowers().add(userId1);
     userRepository.save(user1);
     userRepository.save(user2);
     return user1;

    }

    @Override
    public User searchByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }

    @Override
    public List<User> searchUser(String name) {
        List<User> users = userRepository.searchUser(name);
        return users;
    }
}
