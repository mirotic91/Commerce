package com.example.commerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_cart")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(exclude = "cartProducts")
public class Cart extends AbstractEntity<Long> {

  @Id
  private Long id;

  @OneToOne(optional = false)
  @JoinColumn(name = "id")
  private User user;

  @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<CartProduct> cartProducts = new HashSet<>();

  public Cart(User user) {
    this.id = user.getId();
  }

}
