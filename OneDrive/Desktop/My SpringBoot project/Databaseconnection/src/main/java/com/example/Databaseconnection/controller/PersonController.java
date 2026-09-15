package com.example.Databaseconnection.controller;

import com.example.Databaseconnection.model.employee;
import com.example.Databaseconnection.model.person;
import com.example.Databaseconnection.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class PersonController {
    @Autowired
    private PersonRepo repo;

    @PostMapping("/addUser")
    public void addPerson(@RequestBody person person){
        repo.save(person);
    }

}
