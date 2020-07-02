package com.ttt.demo.controller;

import com.ttt.demo.pojo.User;
import com.ttt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @CrossOrigin // 跨域 // 或者配置 MyWebConfigurer.java
    /*
    * @Override
    public void addCorsMappings(CorsRegistry registry) {
        //所有请求都允许跨域
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }*/ // todo ?
    @GetMapping("/api/user/all")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @CrossOrigin
    @DeleteMapping("/api/user/{id}")
    public String delete(@PathVariable("id")int id){
        if(userService.getById(id) == null){
            return "-1";
        }else {
            userService.delete(id);
            return null;
        }
    }


}
