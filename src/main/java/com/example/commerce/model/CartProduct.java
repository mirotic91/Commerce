package com.example.commerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_cart_product")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CartProduct extends AbstractEntity<Long> {

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private Integer buyCount;

  @ManyToOne(optional = false)
  @JoinColumn(name = "cart_id", referencedColumnName = "id")
  private Cart cart;

  @ManyToOne(optional = false)
  @JoinColumn(name = "product_id", referencedColumnName = "id")
  private Product product;

  public CartProduct(Cart cart, Product product) {
    this.cart = cart;
    this.product = product;
  }

  public CartProduct(Cart cart, Product product, Integer buyCount) {
    this(cart, product);
    this.buyCount = buyCount;
  }

}
