package com.dev.service;

import com.dev.dto.request.RegisterRequestDto;
import com.dev.dto.response.LoginResponseDto;
import com.dev.entity.Auth;
import com.dev.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    public Auth register(RegisterRequestDto dto) {
        return authRepository.save(Auth.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .build());
    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }
}
