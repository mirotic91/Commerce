package com.example.commerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_user")
@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = "cart")
public class User extends AbstractEntity<Long> {

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

  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Cart cart;

  @ManyToMany
  @JoinTable(name = "t_user_authority", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "authority_id") })
  private Set<Authority> authorities = new HashSet<>();

}
