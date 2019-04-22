package com.service.impl;/*
  author:huyao
  date:2019/4/22
  */

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public void add(User user) {
       userDao.add(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User findById(Integer id) {
        return (User) userDao.findById( id );
    }
    @Transactional
    @Override
    public void delete(User user) {
         userDao.delete( user );

    }

    @Override
    public User findOne(Integer id) {
        return (User)userDao.findById(id);
    }
}
