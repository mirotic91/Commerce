package com.example.commerce.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import com.example.commerce.base.BaseTestCase;
import com.example.commerce.model.Product;
import com.example.commerce.vo.DataListRequestVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductRepositoryTest extends BaseTestCase {

  @Autowired
  private ProductRepository productRepository;

  @Test
  public void findByOrderByCreatedDateDesc() {
    DataListRequestVO requestVO = new DataListRequestVO();
    requestVO.setPage(3);
    requestVO.setPageSize(5);

    Page<Product> list = productRepository.findByOrderByCreatedDateDesc(requestVO.getPageable());
    log.debug("{}", list.getContent());
    log.debug("page : {}, pageSize : {}, totalPages : {}, totalElements : {}",
            list.getNumber() + 1, list.getSize(), list.getTotalPages(), list.getTotalElements());
  }

}