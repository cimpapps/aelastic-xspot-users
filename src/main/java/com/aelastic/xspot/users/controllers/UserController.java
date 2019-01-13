package com.aelastic.xspot.users.controllers;


import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("")
    public String hello() {
        return "HELLO WORLD";
    }


    @GetMapping("/users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }


}
