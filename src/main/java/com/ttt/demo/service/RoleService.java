package com.ttt.demo.service;

import com.ttt.demo.dao.RoleDAO;
import com.ttt.demo.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleDAO roleDAO;

    public List<Role> getRoleList() {
        return roleDAO.findAll();
    }

    public List<String> getRoleNameList() {
        List<Role> roleList = roleDAO.findAll();
        List<String> result = new ArrayList<>();
        for (Role temp : roleList) {
            result.add(temp.getName());
        }
        return result;
    }

    public Role getRoleByName(String name) {
        return roleDAO.getByName(name);
    }

    public void add(Role role) {
        roleDAO.save(role);
    }
}
