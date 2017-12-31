package com.example.commerce.common;

import com.example.commerce.model.User;
import com.example.commerce.util.SecurityUtil;

public class BaseController {

  protected User getCurrentUser() {
    return SecurityUtil.getCurrentUser();
  }

}
