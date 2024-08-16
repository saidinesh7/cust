package com.example.demo.contr;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustRepo;



@RestController
public class Controll {

     @Autowired
    private CustRepo custRepo;
 
    @GetMapping("/")
    public String getAllCust(){
        return "sai";
    }
    @GetMapping("/all")
    public List<Customer> getAlCust(){
        return custRepo.findAll();
    }
}
