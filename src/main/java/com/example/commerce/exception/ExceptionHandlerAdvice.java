package com.example.commerce.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.commerce.vo.ResponseVO;

@ControllerAdvice(annotations = { RestController.class })
public class ExceptionHandlerAdvice {

  @ResponseBody
  @ExceptionHandler(BaseException.class)
  public ResponseVO baseException(BaseException ex) {
    return new ResponseVO(ex.getResultCode(), ex.getMessage());
  }

}
