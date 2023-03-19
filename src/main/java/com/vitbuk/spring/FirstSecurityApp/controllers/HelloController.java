package com.vitbuk.spring.FirstSecurityApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
