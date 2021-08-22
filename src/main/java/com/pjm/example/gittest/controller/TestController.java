package com.pjm.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("index")
    public void test(){
        System.out.println("hello");
    }
}
