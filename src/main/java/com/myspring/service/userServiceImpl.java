package com.myspring.service;

import com.myspring.POJO.user;
import com.myspring.mapper.UserMapper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class userServiceImpl implements userService{
    private UserMapper usermapper;

    public UserMapper getUserMapper() {
        return usermapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.usermapper = userMapper;
    }

    public void show() {
        List<user> users = usermapper.SelectAll();
        for (user user : users) {
            System.out.println(user);
        }
    }
}
