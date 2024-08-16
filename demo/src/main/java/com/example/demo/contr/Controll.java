package com.example.demo.contr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controll {


 
    @GetMapping("/")
    public String getAllCust(){
        return "sai";
    }
}
