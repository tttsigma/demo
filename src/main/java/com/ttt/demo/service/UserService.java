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
        return userDAO.findAllByNameAndPassword(name,password);
    }

    public User getById(int id){
        return userDAO.findById(id);
    }

    public void add(User user){
        userDAO.save(user);
    }

    public void delete(int id){
        userDAO.delete(getById(id));
    }

    public void update(User bean){
        userDAO.save(bean);
    }
}
