package com.atguigu.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "这是新的sprigboot框架cccccvvvvvvvvvvvv";
    }
}
