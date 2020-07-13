package com.ttt.demo.dao;

import com.ttt.demo.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role,Integer> {

}
