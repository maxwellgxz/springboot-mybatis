package com.spring.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018-09-12.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
