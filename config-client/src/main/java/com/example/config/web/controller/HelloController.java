package com.example.config.web.controller;

import com.example.config.web.bean.HelloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloConfig helloConfig;

    @GetMapping("/")
    public String hello() {
        return helloConfig.getName();
    }
}
