package com.example.keycloakspringboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/user1")
    public String testing1(){
        return "Success for user 1";
    }

    @GetMapping("/user2")
    public String testing2(){
        return "Success for user 2";
    }



}
