package com.example.commerce.repository;

import com.example.commerce.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {

  Authority findByAuthority(String authority);

}
