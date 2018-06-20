package com.test.imp;

import com.alibaba.dubbo.config.annotation.Service;
import domin.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;


@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return  userMapper.getOne(1L);
    }

}