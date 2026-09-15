package com.example.Databaseconnection.controller;

import com.example.Databaseconnection.model.employee;
import com.example.Databaseconnection.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class addEmployee {
    @Autowired
    private EmployeeRepo repo;

    @PostMapping("/empdata")
    public void employable(@RequestBody employee emp){
        repo.save(emp);
    }

    // get employee details
    @GetMapping("/EmpList")
    public List<employee> empList(){
        return repo.findAll();
    }

    // update
    @PutMapping("/Empupdate")
    public void updateEmp(@RequestBody employee emp){
        repo.save(emp);
    }

    //delete
    @DeleteMapping("/DeleteEmp")
    public void deleteEmp(@RequestBody employee emp){
        repo.delete(emp);
    }

}
