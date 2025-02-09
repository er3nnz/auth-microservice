package com.dev.controller;

import com.dev.document.UserProfile;
import com.dev.dto.request.CreateUserRequestDto;
import com.dev.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static com.dev.config.RestApis.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USERPROFILE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDto createUserRequestDto) {
        userProfileService.createUser(createUserRequestDto);
        return ResponseEntity.ok(true);
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<UserProfile>> getAll() {
    return ResponseEntity.ok(userProfileService.getAll());
    }
}
