package com.example.commerce.base;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebAppConfiguration
public abstract class BaseControllerTestCase extends BaseTestCase {

  @Autowired
  protected WebApplicationContext wac;

  protected MockMvc mockMvc;

  public BaseControllerTestCase() {}

  @Before
  public void onSetUp() {
    mockMvc = MockMvcBuilders.webAppContextSetup(wac).alwaysDo(print()).build();
  }

  public MockHttpServletRequestBuilder getRequest(String url, Object... urlVariables) {
    return get(url, urlVariables);
  }

  public MockHttpServletRequestBuilder postRequest(String url, Object... urlVariables) {
    return post(url, urlVariables);
  }

}
