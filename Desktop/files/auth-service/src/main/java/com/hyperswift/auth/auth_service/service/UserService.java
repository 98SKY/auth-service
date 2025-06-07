package com.hyperswift.auth.auth_service.service;

import com.hyperswift.auth.auth_service.entity.User;
import java.util.Optional;


public interface UserService {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    User save(User user);
}
