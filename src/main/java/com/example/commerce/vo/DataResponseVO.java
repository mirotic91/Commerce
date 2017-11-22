package com.example.commerce.vo;

import com.example.commerce.common.ResultCodes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DataResponseVO<T> extends ResponseVO {

  private T data;

  public DataResponseVO(String resultCode) {
    super(resultCode);
  }

  public DataResponseVO(T data) {
    this(ResultCodes.OK);
    this.data = data;
  }

}
