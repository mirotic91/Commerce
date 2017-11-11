package com.example.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.commerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

}
