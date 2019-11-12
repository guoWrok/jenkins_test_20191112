package com.gsf.jenkinsdemo20191112.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "hello springboot!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello jenkins!";
    }

}
