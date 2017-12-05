package com.example.commerce.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity<K extends Serializable> implements Serializable {

  @CreatedDate
  @Column(updatable = false)
  protected Date createdDate;

  @CreatedBy
  @Column(updatable = false)
  protected Long createdBy;

  @LastModifiedDate
  protected Date updatedDate;

  @LastModifiedBy
  protected Long updatedBy;

  public abstract String toString();

  public abstract K getId();

}
