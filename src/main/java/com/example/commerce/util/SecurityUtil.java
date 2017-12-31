package com.example.commerce.util;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.commerce.model.User;

public final class SecurityUtil {

  public static UserDetails getCurrentUserDetails() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null || !authentication.isAuthenticated())
      return null;

    return (UserDetails)authentication.getPrincipal();
  }

  public static User getCurrentUser() {
    UserDetails userDetails = getCurrentUserDetails();
    if (userDetails == null)
      throw new AccessDeniedException("User not found in security session.");

    return (User)userDetails;
  }

}
