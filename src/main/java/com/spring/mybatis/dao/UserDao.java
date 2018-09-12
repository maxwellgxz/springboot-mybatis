package com.spring.mybatis.dao;

import com.spring.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public void addUser(User user);

    public void updateUserById(User user);

    public void deleteUserById(String userid);

    public User getUserById(String userid);

    public List<User> getUserList(User user);
}
