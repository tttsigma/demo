package com.ttt.demo.dao;

import com.ttt.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {
    List<User> findAll();

    User findAllByNameAndAndPassword(String name,String password);
}
