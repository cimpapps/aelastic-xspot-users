package com.aelastic.xspot.users.services;

import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.models.utils.UserMapper;
import com.aelastic.xspot.users.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserDto> findAll() {
        return userRepo.findAll().stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }

}