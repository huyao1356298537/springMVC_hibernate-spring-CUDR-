package com.controller;/*
  author:huyao
  date:2019/4/22
  */

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("addUser")
    public User addUser(User user){
        userService.add(user);

        return user;
    }
    @RequestMapping("findAll")
    public  List<User> findAll(){
       return userService.findAll();
    }


    @RequestMapping("updateUser")
    public User update(User user){
        userService.update(user);
        return user;
    }
    @RequestMapping("findById")
    public User findById(Integer id) {
        return  userService.findById( id );
    }

    @RequestMapping("delete")
    public void delete(User user) {
            userService.delete( user );
    }

    @RequestMapping("findOne/{id}")
    public  User findOne(@PathVariable(name = "id") Integer id){
        return userService.findOne(id);
    }

}
