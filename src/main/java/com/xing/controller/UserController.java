package com.xing.controller;

import com.xing.mapper.UserMapper;
import com.xing.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList ();
        for(User user:userList){
            System.out.println (user);
        }
        return userList;
    }

    //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser (new User (9,"说",222));
        return "ok";
    }

    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser (new User (5,"说",1211));
        return "ok";
    }

    //根据id删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser (5);
        return "ok";
    }
















}
