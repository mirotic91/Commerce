package com.example.commerce.exception;

import com.example.commerce.common.ResultCodes;

public class UserPasswordNotMatchedException extends BaseException {

  private static final long serialVersionUID = -4509503570683886400L;

  public UserPasswordNotMatchedException() {
    this(null);
  }

  public UserPasswordNotMatchedException(String message) {
    super(ResultCodes.USER_PASSWORD_NOT_MATCHED, message);
  }

}
