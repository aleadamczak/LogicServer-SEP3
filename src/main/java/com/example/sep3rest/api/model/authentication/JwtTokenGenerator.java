package com.example.sep3rest.api.model.authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import com.example.sep3rest.api.model.domain.User;
import java.security.Key;
import java.util.Date;

public class JwtTokenGenerator {

  public static String generateJwtToken(User user) {

    long expirationTimeMillis = System.currentTimeMillis() + 3600000; // 1 hour

    // Generate a secure key for signing the token
    Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);

    // Build the JWT token with the desired claims



    JwtBuilder jwtBuilder = Jwts.builder()
        .setSubject(String.valueOf(user.getUsername()))
        .claim("username", user.getUsername())
        .claim("password", user.getPassword())
        .claim("name", user.getName())
        .claim("isAdmin", String.valueOf(user.isAdmin()))
        .claim("id", user.getId())
        .setExpiration(new Date(expirationTimeMillis))
        .signWith(key);

    // Compact the token
    String token = jwtBuilder.compact();

    return token;
  }
}

