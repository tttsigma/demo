package com.ttt.demo.service;

import com.ttt.demo.dao.RoleDAO;
import com.ttt.demo.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleDAO roleDAO;

    public List<Role> getRoleList(){
        return roleDAO.findAll();
    }
}
