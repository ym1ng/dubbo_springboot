package com.test.imp;

import com.alibaba.dubbo.config.annotation.Service;
import domin.User;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.TestService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {

        return  userMapper.getOne(1L);
    }

}