package com.example.commerce.user;

import com.example.commerce.common.Authorities;
import com.example.commerce.exception.UserNotFoundException;
import com.example.commerce.exception.UserPasswordNotMatchedException;
import com.example.commerce.exception.UsernameExistException;
import com.example.commerce.model.Authority;
import com.example.commerce.model.Cart;
import com.example.commerce.model.User;
import com.example.commerce.repository.AuthorityRepository;
import com.example.commerce.repository.UserRepository;
import com.example.commerce.util.ParameterUtil;
import com.example.commerce.util.PasswordUtil;
import com.example.commerce.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AuthorityRepository authorityRepository;

  @Autowired
  private PasswordUtil passwordUtil;

  @PostMapping(value = "/join")
  public ResponseVO join(User user) {

    ParameterUtil.checkParameterEmpty(user.getUsername(), user.getPassword(), user.getName());
    checkDuplicatedUsername(user.getUsername());

    Authority authority = authorityRepository.findByAuthority(Authorities.USER);
    user.getAuthorities().add(authority);
    user.setPassword(passwordUtil.encodePassword(user.getPassword()));
    userRepository.save(user);

    Cart cart = new Cart(user);
    user.setCart(cart);
    userRepository.save(user);

    return ResponseVO.ok();
  }

  private void checkDuplicatedUsername(String username) {

    User user = userRepository.findByUsername(username);

    if (user != null)
      throw new UsernameExistException();
  }

  @PostMapping("/login")
  public ResponseVO login(@RequestParam String username, @RequestParam String password) {

    User user = userRepository.findByUsername(username);

    if (user == null)
      throw new UserNotFoundException();

    if (!passwordUtil.isMatchedPassword(password, user.getPassword()))
      throw new UserPasswordNotMatchedException();

    SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities()));

    return ResponseVO.ok();
  }

  @GetMapping("/logout")
  public ResponseVO logout(HttpServletRequest request) {

    HttpSession session = request.getSession(false);

    if (session != null)
      session.invalidate();

    SecurityContextHolder.clearContext();

    return ResponseVO.ok();
  }

}