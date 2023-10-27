package com.example.registrationloginSpringBootsecurityThymeleaf.repository;

import com.example.registrationloginSpringBootsecurityThymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > { // after added @Repository, we're now able to leverage CRUD database operations for user JPA Entity
}
