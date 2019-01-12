package com.aelastic.xspot.users.controllers;


import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public List<UserDto> findAll() {
        return userService.findAll();
    }

}
