package com.example.springLearningProjectOne.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/error")
public class ErrorHandler {
    public ErrorHandler(){

    }
    @GetMapping
    public String error(){
        return "Error";
    }
}
