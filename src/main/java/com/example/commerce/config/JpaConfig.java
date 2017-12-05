package com.example.commerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.commerce.repository")
public class JpaConfig {

  @Bean
  public AuditorAware<Long> auditorProvider() {
    return new SpringSecurityAuditorAware();
  }

}