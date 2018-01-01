package com.example.commerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_authority")
@Data
@EqualsAndHashCode(of = "id")
public class Authority extends AbstractEntity<Long> implements GrantedAuthority {

  @Id
  @GeneratedValue
  private Long id;

  @Column(length = 30)
  private String authority;

}
