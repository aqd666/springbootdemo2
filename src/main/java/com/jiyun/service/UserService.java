package com.jiyun.service;

import com.jiyun.dao.UserMapper;
import com.jiyun.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public List<User> findList(){
        return userMapper.findList();
    }



}
