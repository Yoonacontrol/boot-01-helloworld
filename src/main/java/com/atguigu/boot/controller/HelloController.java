package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        System.out.println("hello world");
        System.out.println("hello world2");
        System.out.println("master test");
        System.out.println("hot-fix test");
        return "hello,spring boot 2";
    }
}
