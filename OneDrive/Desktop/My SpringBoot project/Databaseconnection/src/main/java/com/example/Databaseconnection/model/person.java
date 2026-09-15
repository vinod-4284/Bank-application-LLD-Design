package com.example.Databaseconnection.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class person {
    @Id
    private int id;
    private String name;
}
