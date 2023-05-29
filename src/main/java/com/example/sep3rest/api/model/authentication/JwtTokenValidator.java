package com.example.sep3rest.api.model.authentication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.List;

public class JwtTokenValidator {

  public static boolean validateTokenForLoggedUsers(String token) {
    SecretKey key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);

    try {
      Claims claims = Jwts.parserBuilder()
          .setSigningKey(key)
          .build()
          .parseClaimsJws(token)
          .getBody();

      boolean loggedUsersOnly = claims.getSubject() != null;
      return loggedUsersOnly;
    } catch (JwtException e) {
      // Token validation failed
      return false;
    }
  }

  public static boolean validateTokenForAdmins(String token) {
    SecretKey key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256);

    try {
      Claims claims = Jwts.parserBuilder()
          .setSigningKey(key)
          .build()
          .parseClaimsJws(token)
          .getBody();

      boolean mustBeAdmin = claims.containsKey("isAdmin") && claims.get("isAdmin", Boolean.class);
      return mustBeAdmin;
    } catch (JwtException e) {
      // Token validation failed
      return false;
    }
  }
}

