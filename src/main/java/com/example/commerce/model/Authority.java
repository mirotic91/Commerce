package com.example.commerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_authority")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class Authority implements GrantedAuthority {

  @Id
  @GeneratedValue
  private Long id;

  @Column(length = 30)
  private String authority;

}
