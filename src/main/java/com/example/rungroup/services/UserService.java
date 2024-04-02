package com.example.rungroup.services;

import com.example.rungroup.dto.RegistrationDTO;
import com.example.rungroup.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDTO registrationDTO);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
