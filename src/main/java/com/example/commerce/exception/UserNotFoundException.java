package com.example.commerce.exception;

import com.example.commerce.common.ResultCodes;

public class UserNotFoundException extends BaseException {

  private static final long serialVersionUID = -4509503245252386400L;

  public UserNotFoundException() {
    this(null);
  }

  public UserNotFoundException(String message) {
    super(ResultCodes.USER_NOT_FOUND, message);
  }

}
