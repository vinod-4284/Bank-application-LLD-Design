package com.example.Databaseconnection.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employeetable")
public class employee {
    @Id
    private int empId;
    private String empName;
    private String deptName;
}
