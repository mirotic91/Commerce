package com.example.commerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "t_product")
@Data
@EqualsAndHashCode(of = "id")
public class Product extends AbstractEntity<Long> {

  @Id
  @GeneratedValue
  private Long id;

  @Column(length = 50)
  private String color;

  @Column(length = 100)
  private String name;

  @Lob
  @Column
  private String description;

  @Column(nullable = false)
  private Double price;

  @Column(length = 100)
  private String imageFileName;

}
