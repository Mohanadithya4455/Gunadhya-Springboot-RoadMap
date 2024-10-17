package com.example.socialmedia_backend.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtProvider {
    static SecretKey key = Keys.hmacShaKeyFor(JwtValues.key.getBytes());
    public static String generateTokenFromJwt(Authentication authentication){

        String jwt = Jwts.builder().setIssuer("Adithya").setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+864000))
                .claim("email",authentication.getName())
                .signWith(key)
                .compact();
        return jwt;
    }
    public static String getMailFromToken(String jwt){
        jwt = jwt.substring(7);
        Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
        String email = String.valueOf(claims.get("email"));
        return email;
    }
}
