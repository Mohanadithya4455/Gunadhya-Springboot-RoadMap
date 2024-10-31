package com.example.socialmedia_backend.controller;

import com.example.socialmedia_backend.config.JwtProvider;
import com.example.socialmedia_backend.models.User;
import com.example.socialmedia_backend.repositories.UserRepository;
import com.example.socialmedia_backend.responses.AuthResponse;
import com.example.socialmedia_backend.responses.LoginRequest;
import com.example.socialmedia_backend.responses.LoginResponse;
import com.example.socialmedia_backend.service.MyLoadUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    MyLoadUserService myLoadUserService;
    @PostMapping("/signup")
    public AuthResponse saveUser(@RequestBody User user) {
        User user1 = new User();
        user1.setId(user.getId());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        user1.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user1);
        Authentication authentication = new UsernamePasswordAuthenticationToken(user1.getEmail(),user1.getPassword());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = JwtProvider.generateToken(authentication);
        AuthResponse auth = new AuthResponse();
        auth.setJwt(jwt);
        auth.setMessage("Successfully registered");
        return auth;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) throws Exception {
        String username=loginRequest.getEmail();
        String password = loginRequest.getPassword();
        Authentication authentication = checkValid(username,password);
       // SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = JwtProvider.generateToken(authentication);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setJwt(jwt);
        loginResponse.setMessage("Successfully logged in...");
        return loginResponse;
    }

    private Authentication checkValid(String username, String password) throws Exception {
        UserDetails user = myLoadUserService.loadUserByUsername(username);
        if(user==null){
            throw new Exception("User not found with this "+username);
        }
        if(!passwordEncoder.matches(password,user.getPassword())){

            throw new BadCredentialsException("Bad Credentials...");
        }
        return new UsernamePasswordAuthenticationToken(user.getUsername(),null,null);
    }


}
