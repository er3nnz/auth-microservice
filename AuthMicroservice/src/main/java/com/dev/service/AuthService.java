package com.dev.service;

import com.dev.dto.request.CreateUserRequestDto;
import com.dev.dto.request.RegisterRequestDto;
import com.dev.dto.response.LoginResponseDto;
import com.dev.entity.Auth;
import com.dev.manager.UserProfilerManager;
import com.dev.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;
    private final UserProfilerManager userProfilerManager;

    public Auth register(RegisterRequestDto dto) {
        Auth auth = authRepository.save(Auth.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .email(dto.getEmail())
                .build());
        userProfilerManager.createUser(CreateUserRequestDto.builder()
                .authId(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build());
        return auth;
    }

    public Boolean login(LoginResponseDto dto) {
        return authRepository.existsByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }
}
