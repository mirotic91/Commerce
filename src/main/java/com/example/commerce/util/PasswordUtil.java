package com.example.commerce.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public final class PasswordUtil {

  @Autowired
  private PasswordEncoder passwordEncoder;

  private PasswordUtil() {}

  public String encodePassword(String rawPassword) {
    return passwordEncoder.encode(rawPassword);
  }

  public boolean isMatchedPassword(String rawPassword, String encodedPassword) {
    rawPassword = StringUtils.defaultString(rawPassword);
    encodedPassword = StringUtils.defaultString(encodedPassword);

    return passwordEncoder.matches(rawPassword, encodedPassword);
  }

}