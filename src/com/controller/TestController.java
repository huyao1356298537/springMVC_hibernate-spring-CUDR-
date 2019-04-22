package com.controller;/*
  author:huyao
  date:2019/4/22
  */

import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 默认返回json
@RestController
//@Controller
public class TestController {

    @RequestMapping("/hello123")
//    @ResponseBody
    public User hello(){
        User user = new User("zhangsan", "zhangsan123");
        return  user;
    }

    @RequestMapping("/hehe")
    public User hehe(){
        User user = new User("zhangsan", "hehe123");
        return  user;
    }

}
