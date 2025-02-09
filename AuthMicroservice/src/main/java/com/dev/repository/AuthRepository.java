package com.dev.repository;

import com.dev.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    Boolean existsByUsernameAndPassword(String username, String password);
}
