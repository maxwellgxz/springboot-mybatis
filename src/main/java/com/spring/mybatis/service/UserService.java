package com.spring.mybatis.service;

import com.spring.mybatis.bean.User;

import java.util.List;


public interface UserService {

    public void addUser(User user);

    public void updateUserById(User user);

    public void deleteUserById(String userid);

    public User getUserById(String userid);

    public List<User> getUserList(User user);
}
