package com.aelastic.xspot.users.controllers;


import com.aelastic.xspot.users.models.dto.UserDto;
import com.aelastic.xspot.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "", consumes = APPLICATION_JSON_VALUE)
    public String hello() {
        return "HELLO WORLD";
    }


    @GetMapping(value = "", produces = APPLICATION_JSON_VALUE)
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @PostMapping(value = "", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public UserDto addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

    @GetMapping(value = "/activate/users/{id}", consumes = TEXT_PLAIN_VALUE, produces = APPLICATION_JSON_VALUE)
    public UserDto activateUser(@PathVariable String id) {
        return userService.activateUser(id);
    }

}
