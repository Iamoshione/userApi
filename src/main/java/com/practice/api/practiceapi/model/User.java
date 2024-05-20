package com.practice.api.practiceapi.model;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(unique=true)
    public String name;

    @Column(unique=true)
    public String email;

    @Column(unique=true)
    public String occupation;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
}
