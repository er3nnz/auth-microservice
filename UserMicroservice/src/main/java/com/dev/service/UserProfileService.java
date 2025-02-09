package com.dev.service;

import com.dev.document.UserProfile;
import com.dev.dto.request.CreateUserRequestDto;
import com.dev.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public void createUser(CreateUserRequestDto createUserRequestDto) {
        userProfileRepository.save(UserProfile.builder()
                .authId(createUserRequestDto.getAuthId())
                .username(createUserRequestDto.getUsername())
                .email(createUserRequestDto.getEmail())
                .build());
    }

    public List<UserProfile> getAll() {
        return userProfileRepository.findAll();
    }
}
