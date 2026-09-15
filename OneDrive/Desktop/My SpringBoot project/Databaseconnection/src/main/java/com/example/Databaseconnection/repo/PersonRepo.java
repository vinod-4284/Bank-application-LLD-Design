package com.example.Databaseconnection.repo;

import com.example.Databaseconnection.model.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepo extends JpaRepository<person, Long> {

}
