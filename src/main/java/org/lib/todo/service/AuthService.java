package org.lib.todo.service;

import org.lib.todo.web.dto.auth.JwtRequest;
import org.lib.todo.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest request);

    JwtResponse refresh(String refreshToken);
}
