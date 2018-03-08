package com.example.commerce.util;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.example.commerce.login.CustomUserDetails;

public final class SecurityUtil {

  public static CustomUserDetails getCurrentUserDetails() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null || !authentication.isAuthenticated())
      return null;

    CustomUserDetails userDetails = (CustomUserDetails)authentication.getPrincipal();
    if (userDetails == null)
      throw new AccessDeniedException("User not found in security session.");

    return userDetails;
  }

}
