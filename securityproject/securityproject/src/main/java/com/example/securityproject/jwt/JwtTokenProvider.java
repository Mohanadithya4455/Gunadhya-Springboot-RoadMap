package com.example.securityproject.jwt;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class JwtTokenProvider {
       SecretKey key = Keys.hmacShaKeyFor(JwtValues.key.getBytes());
    public String generateToken(Authentication authentication){
           Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
           String role = convertIntoString(authorities);
           String jwt = Jwts.builder().setIssuedAt(new Date()).setExpiration(new Date(new Date().getTime()+86400000))
                   .claim("email",authentication.getName()).claim("authorities",role)
                   .signWith(key)
                   .compact();
           return jwt;
    }

    public String getEmailFromToken(String jwt){
        jwt=jwt.substring(7);
        Claims claims=Jwts.parserBuilder().setSigningKey(key)
                .build().parseClaimsJws(jwt).getBody();
        String email=String.valueOf(claims.get("email"));
        return email;
    }

    private String convertIntoString(Collection<? extends GrantedAuthority> authorities) {
        Set<String> set = new HashSet<>();

        for(GrantedAuthority authority:authorities){
            set.add(authority.getAuthority());
        }
        return String.join(",",set);
    }
}
