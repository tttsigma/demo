package com.ttt.demo.controller;

import com.ttt.demo.pojo.User;
import com.ttt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
}
