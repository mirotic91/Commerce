package com.example.commerce.config;

import com.example.commerce.login.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
            .antMatchers("/admin/login").anonymous()
            .antMatchers("/resources/**").permitAll()
            .antMatchers("/api/**").hasAuthority("USER")
            .antMatchers("/admin/**").hasAuthority("ADMIN")
            .anyRequest().authenticated()
        .and().formLogin().loginPage("/admin/login")
        .and().csrf().disable();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    return new CustomUserDetailsService();
  }

}