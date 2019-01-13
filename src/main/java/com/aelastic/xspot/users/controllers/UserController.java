package com.aelastic.xspot.users.controllers;


import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "HELLO WORLD";
    }


    @GetMapping("/users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public UserDto addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

}
