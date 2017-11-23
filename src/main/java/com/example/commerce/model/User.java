package com.example.commerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @Column(length = 20)
  private String name;

  @Column(unique = true, length = 20)
  private String username;

  @Column(length = 60)
  private String password;

  @Column(unique = true, length = 50)
  private String email;

  @Column(length = 20)
  private String mobile;

  @ManyToMany
  @JoinTable(name = "t_user_authority", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "authority_id") })
  private Set<Authority> authorities = new HashSet<>();

}
