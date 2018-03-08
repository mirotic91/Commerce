package com.example.commerce.common;

import com.example.commerce.util.SecurityUtil;

public class BaseController {

  protected Long getCurrentUserId() {
    return SecurityUtil.getCurrentUserDetails().getId();
  }

}
