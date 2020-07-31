package com.jiyun.controller;


import com.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("/")
    @ResponseBody
    public Object findList(){
        return userService.findList();
    }


}
