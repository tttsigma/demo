package com.ttt.demo.controller;

import com.ttt.demo.pojo.Role;
import com.ttt.demo.result.Result;
import com.ttt.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @CrossOrigin
    @GetMapping("/api/role/all")
    public List<Role> getAllRole() {
        return roleService.getRoleList();
    }

    @CrossOrigin
    @GetMapping("/api/role/all-name")
    public List<String> getAllRoleName() {
        return roleService.getRoleNameList();
    }

    @CrossOrigin
    @GetMapping("/api/role/{name}")
    public Role getRoleByName(@PathVariable("name") String name) {
        return roleService.getRoleByName(name);
    }

    @CrossOrigin
    @PostMapping("/api/role")
    public Result add(@RequestBody Role bean) {
        roleService.add(bean);
        return new Result(200);
    }

    @CrossOrigin
    @DeleteMapping("/api/role/{id}")
    public Result delete(@PathVariable int id) {
        if (roleService.getRoleById(id) == null) {
            return new Result(400);
        } else {
            roleService.delete(id);
            return new Result(200);
        }
    }

    @CrossOrigin
    @PutMapping("/api/role/{id}")
    public Result update(@RequestBody Role bean){
        roleService.update(bean);
        return new Result(200);
    }
}
