package com.ttt.demo.service;

import com.ttt.demo.dao.UserDAO;
import com.ttt.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public List<User> getAllUsers(){
        return userDAO.findAll();
    }

    public User getByNameAndPassword(String name,String password){
        return userDAO.findAllByNameAndAndPassword(name,password);
    }

    public void add(User user){
        userDAO.save(user);
    }

    public void delete(User user){
        userDAO.delete(user);
    }
}
