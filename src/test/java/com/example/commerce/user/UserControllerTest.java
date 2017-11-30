package com.example.commerce.user;

import com.example.commerce.base.BaseControllerTestCase;
import com.example.commerce.common.ResultCodes;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserControllerTest extends BaseControllerTestCase {

  @Test
  public void join_success() throws Exception {
      mockMvc.perform(postRequest("/join")
              .param("username", "test")
              .param("password", "111111")
              .param("name", "kim")
      )
      .andExpect(status().isOk());
  }

    @Test
    public void join_fail_requestGet() throws Exception {
        mockMvc.perform(getRequest("/join")
                .param("username", "test")
                .param("password", "111111")
                .param("name", "kim")
        )
        .andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void join_fail_usernameAlreadyExist() throws Exception {
        mockMvc.perform(postRequest("/join")
                .accept(MediaType.APPLICATION_JSON)
                .param("username", "user")
                .param("password", "111111")
                .param("name", "lee")
        )
        .andExpect(status().isOk())
        .andExpect(jsonPath("resultCode").value(ResultCodes.USER_ALREADY_EXIST));
    }

    @Test
    public void login_success() throws Exception {
        mockMvc.perform(postRequest("/login")
                .param("username", "user")
                .param("password", "111111")
        )
        .andExpect(status().isOk());
    }

    @Test
    public void login_fail_passwordNotMatch() throws Exception {
        mockMvc.perform(postRequest("/login")
                .param("username", "user")
                .param("password", "222222")
        )
        .andExpect(status().isOk());
    }

}