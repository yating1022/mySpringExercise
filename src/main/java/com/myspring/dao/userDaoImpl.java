package com.myspring.dao;

import com.myspring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Value;

public class userDaoImpl implements userDao{

    public void show() {
        System.out.println("userDaoImol被执行");
    }
}
