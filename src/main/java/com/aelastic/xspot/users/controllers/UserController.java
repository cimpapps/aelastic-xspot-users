package com.aelastic.xspot.users.controllers;


import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/users/{id}")
    public UserDto updateUser(@PathVariable String id) {
        return userService.activateUser(id);
    }

}
