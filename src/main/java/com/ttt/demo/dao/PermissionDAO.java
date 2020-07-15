package com.ttt.demo.dao;

import com.ttt.demo.pojo.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDAO extends JpaRepository<Permission,Integer> {

}
