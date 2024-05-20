package com.practice.api.practiceapi.controller;


import com.practice.api.practiceapi.model.User;
import com.practice.api.practiceapi.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {


    @Autowired
    public UserRepo userRepo;


    @GetMapping(value = "/")
    public String Name(){
        return "Hello World";
    }
    @GetMapping(value = "/users")
     public List<User>  myUsers(){
        return userRepo.findAll();
     }

}
