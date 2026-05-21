package br.edu.ifce.mn.ads.ifproject.auth.core.security;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String email) {
        return "token";
    }

}