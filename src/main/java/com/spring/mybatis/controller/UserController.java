package com.spring.mybatis.controller;

import com.spring.mybatis.bean.User;
import com.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "toAddUser",method = RequestMethod.GET)
    public String toAddUser(){
        return "user/addUser";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/getUserList";
    }

    @RequestMapping(value = "toEditUser",method = RequestMethod.GET)
    public String toEditUser(String userid,Model model){
        User user = userService.getUserById(userid);
        model.addAttribute("user",user);
        return "user/editUser";
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public String editUser(User user){
        userService.updateUserById(user);
        return "redirect:/getUserList";
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public String deleteUser(String userid) {
        userService.deleteUserById(userid);
        return "redirect:/getUserList";
    }

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public User getUserById(String userid) {
        User user = userService.getUserById(userid);
        return user;
    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public String getUserList(User user, Model model){
        List<User> userList = userService.getUserList(user);
        model.addAttribute("users",userList);
        return "user/list";
    }

}
