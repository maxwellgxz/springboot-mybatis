package com.spring.mybatis.service.impl;

import com.spring.mybatis.bean.User;
import com.spring.mybatis.dao.UserDao;
import com.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public void addUser(User user) {
         userDao.addUser(user);
    }

    @Override
    public void updateUserById(User user) {
         userDao.updateUserById(user);
    }

    @Override
    public void deleteUserById(String userid) {
         userDao.deleteUserById(userid);
    }

    @Override
    public List<User> getUserList(User user) {
        return userDao.getUserList(user);
    }

    @Override
    public User getUserById(String userid) {
        User user =userDao.getUserById(userid);
        return user;
    }


}
