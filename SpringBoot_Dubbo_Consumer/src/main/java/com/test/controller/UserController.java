package com.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import domin.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * 用户控制器
 *
 * @author zym
 * @create 2018-06-19 14:27
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;



    @GetMapping("getUser")
    public User user() {
        return userService.findUser();
    }
}
