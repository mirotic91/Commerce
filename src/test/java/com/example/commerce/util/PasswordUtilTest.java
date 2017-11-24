package com.example.commerce.util;

import com.example.commerce.base.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Slf4j
public class PasswordUtilTest extends BaseTestCase {

  @Autowired
  private PasswordUtil passwordUtil;

  @Test
  public void isMatchedPassword() {
    String rawPassword = "111111";
    String encodedPassword = passwordUtil.encodePassword(rawPassword);
    log.debug(encodedPassword);

    assertTrue(passwordUtil.isMatchedPassword(rawPassword, encodedPassword));
    assertFalse(passwordUtil.isMatchedPassword(rawPassword, rawPassword));
  }

}