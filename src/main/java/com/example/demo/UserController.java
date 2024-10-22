package com.example.demo;

public class UserController{

    @GetMapping 
    public String demo(){
        return "Welcome to springboot testing runners";
    }
}