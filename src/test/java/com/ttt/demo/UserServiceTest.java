package com.ttt.demo;

import com.ttt.demo.pojo.User;
import com.ttt.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends DemoApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void getUser() {
        User user = userService.getById(1);
        Assert.assertEquals("admin", user.getName());
    }
}
