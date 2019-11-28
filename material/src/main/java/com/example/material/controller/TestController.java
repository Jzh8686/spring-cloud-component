package com.example.material.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${name}")
    String test;
    @GetMapping("/test")
    public String test(){

        return test;
    }
}
