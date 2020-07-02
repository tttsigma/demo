package com.ttt.demo.controller;

import com.ttt.demo.pojo.User;
import com.ttt.demo.result.Result;
import com.ttt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getName();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.getByNameAndPassword(username,requestUser.getPassword());

        if (user == null) {
            String message = "账号密码错误";
            System.out.println("error");
            return new Result(400);
        } else {
            System.out.println("ok");
            return new Result(200);
        }
    }
}
