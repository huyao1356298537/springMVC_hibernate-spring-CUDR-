package com.service;/*
  author:huyao
  date:2019/4/22
  */

import com.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void add(User user);

    public void update(User user);

    public User findById(Integer id);

    public void delete(User user );

    public User findOne(Integer id);


}
