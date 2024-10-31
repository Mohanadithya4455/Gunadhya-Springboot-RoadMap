package com.example.securityproject.controllers;


import com.example.securityproject.jwt.JwtTokenProvider;
import com.example.securityproject.jwt.MyUserDetailsService;
import com.example.securityproject.models.User;
import com.example.securityproject.repos.UserRepository;
import com.example.securityproject.requests.Login;
import com.example.securityproject.responses.AuthResponse;
import com.example.securityproject.responses.LoginResponse;
import com.example.securityproject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Security;

@RestController
public class AuthController {

    @Autowired
    MyUserDetailsService myUserDetailsService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtTokenProvider jwtTokenProvider;
    @PostMapping("/signup")
    public AuthResponse createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setName(user.getName());
        newUser.setRole(user.getRole());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(passwordEncoder.encode(user.getPassword()));
        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser.getEmail(),newUser.getPassword());
        AuthResponse authResponse = new AuthResponse();
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenProvider.generateToken(authentication);
        authResponse.setJwt(jwt);
        authResponse.setEmail(newUser.getEmail());
        authResponse.setPassword(newUser.getPassword());
          userRepository.save(newUser);
       return authResponse;
    }
    @PostMapping("/signin")
    public LoginResponse signIn(@RequestBody Login login) throws Exception {
        Authentication authentication = checkValid(login);
        System.out.println(authentication);
        String jwt = jwtTokenProvider.generateToken(authentication);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setJwt(jwt);
        loginResponse.setUsername(login.getUsername());
        loginResponse.setRole(authentication.getAuthorities().toString());
        return loginResponse;
    }

    private Authentication checkValid(Login login) throws Exception {
        UserDetails user = myUserDetailsService.loadUserByUsername(login.getUsername());
        System.out.println(user);
        if(user==null){
            throw new Exception("User not found with this "+login.getUsername());
        }
        if(!passwordEncoder.matches(login.getPassword(),user.getPassword())){
            throw new BadCredentialsException("Your Password is wrong");
        }
        return new UsernamePasswordAuthenticationToken(user,null,user.getAuthorities());
    }

}
