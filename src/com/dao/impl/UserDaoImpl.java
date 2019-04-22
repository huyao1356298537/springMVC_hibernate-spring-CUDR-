package com.dao.impl;/*
  author:huyao
  date:2019/4/22
  */

import com.dao.UserDao;
import com.entity.User;
import com.framework.impl.DaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends DaoImpl<User> implements UserDao<User> {

}
