package com.example.securityproject.service;

import com.example.securityproject.jwt.JwtTokenProvider;
import com.example.securityproject.models.User;
import com.example.securityproject.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByEmail(String email) throws Exception {
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()){
            return user.get();
        }
        throw new Exception("User not Found");
    }

    @Override
    public User getUserByJwt(String jwt) throws Exception {
        String email= jwtTokenProvider.getEmailFromToken(jwt);
        return findByEmail(email);
    }

}
