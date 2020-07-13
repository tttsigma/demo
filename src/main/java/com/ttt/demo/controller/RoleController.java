package com.ttt.demo.controller;

import com.ttt.demo.pojo.Role;
import com.ttt.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired RoleService roleService;

    @CrossOrigin
    @GetMapping("/api/role/all")
    public List<Role> getAllRole(){
        return roleService.getRoleList();
    }
}