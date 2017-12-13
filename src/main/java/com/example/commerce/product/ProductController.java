package com.example.commerce.product;

import com.example.commerce.model.Product;
import com.example.commerce.repository.ProductRepository;
import com.example.commerce.vo.DataListRequestVO;
import com.example.commerce.vo.DataListResponseVO;
import com.example.commerce.vo.DataResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
 
  @Autowired
  private ProductRepository productRepository;
 
  @GetMapping
  public DataListResponseVO<Product> list(DataListRequestVO requestVO) {
    Page<Product> page = productRepository.findByOrderByCreatedDateDesc(requestVO.getPageable());
    return new DataListResponseVO<>(page);
  }

  @GetMapping("/{id}")
  public DataResponseVO<Product> detail(@PathVariable Long id) {
    Product product = productRepository.findOne(id);
    return new DataResponseVO<>(product);
  }

}
