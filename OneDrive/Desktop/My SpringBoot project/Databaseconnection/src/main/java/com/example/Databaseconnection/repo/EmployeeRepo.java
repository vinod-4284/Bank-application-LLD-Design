package com.example.Databaseconnection.repo;

import com.example.Databaseconnection.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepo extends JpaRepository<employee, Long> {
}
