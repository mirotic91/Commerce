package com.example.commerce.product;

import org.junit.Test;

import com.example.commerce.base.BaseControllerTestCase;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductControllerTest extends BaseControllerTestCase {

  @Test
  public void list() throws Exception {
      mockMvc.perform(getRequest("/api/product")
            .param("page", "2")
            .param("pageSize", "5")
      )
      .andExpect(status().isOk());
  }

  @Test
  public void detail() throws Exception {
      mockMvc.perform(getRequest("/api/product/-1"))
      .andExpect(status().isOk());
  }

}