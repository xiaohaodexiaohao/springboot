package com.dist.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * 测试
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "hello,world!";
    }

}
