package org.lib.todo.service.impl;

import org.lib.todo.service.AuthService;
import org.lib.todo.web.dto.auth.JwtRequest;
import org.lib.todo.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest request) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
