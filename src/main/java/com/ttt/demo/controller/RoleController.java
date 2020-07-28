package com.ttt.demo.controller;

import com.ttt.demo.pojo.Role;
import com.ttt.demo.result.Result;
import com.ttt.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired RoleService roleService;

    @CrossOrigin
    @GetMapping("/api/role/all")
    public List<Role> getAllRole(){
        return roleService.getRoleList();
    }

    @CrossOrigin
    @GetMapping("/api/role/all-name")
    public List<String> getAllRoleName(){
        return roleService.getRoleNameList();
    }

    @CrossOrigin
    @GetMapping("/api/role/{name}")
    public Role getRoleByName(@PathVariable("name")String name){
        return roleService.getRoleByName(name);
    }

    @CrossOrigin
    @PostMapping("/api/role")
    public Result add(@RequestBody Role bean){
        roleService.add(bean);
        return new Result(200);
    }
}
