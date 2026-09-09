package com.linkdinproject.APIGateway;

import io.jsonwebtoken.Claims;
import lombok.Value;

import java.nio.charset.StandardCharsets;

public class JwtService {
    @Value("${jwt.secretkey}")
    private String jwtSecretKey;

    private Secretkey getSecretKey(){
        return key.hmacShaKeyFor(jwtSecretKey.getBytes(StandardCharsets.UTF_8));

    }
    public String getUserIdFromToken(String token){
        Claims claims = jwts.parser()
                .verifyWith(getSecretKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
        return claims.getSubject();
    }
}
