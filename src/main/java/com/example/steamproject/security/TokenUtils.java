package com.example.steamproject.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.swing.colorchooser.AbstractColorChooserPanel;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenUtils {

    private final static String ACESS_TOKEN_SECRET = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
    private final static Long ACESS_TOKEN_VALIDITY_SECONDS = 2_592_000L;

    public static String createToken(String userName, String email){
        long expirationTime = ACESS_TOKEN_VALIDITY_SECONDS * 1_000;
        Date expirationDate = new Date(System.currentTimeMillis() + expirationTime);

        Map<String, Object> extra = new HashMap<>();
        extra.put("name", userName);
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACESS_TOKEN_SECRET.getBytes()))
                .compact();
    }

    //Proceso inverso a createToken
    public static UsernamePasswordAuthenticationToken getAuthentication(String token) {
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(ACESS_TOKEN_SECRET.getBytes())
                    .build().parseClaimsJws(token)
                    .getBody();

            System.out.println(" claims -> " + claims);

            String email = claims.getSubject();

            System.out.println(" email -> " + email);


            return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
        } catch (JwtException e) {
            return null;
        }
    }
}
