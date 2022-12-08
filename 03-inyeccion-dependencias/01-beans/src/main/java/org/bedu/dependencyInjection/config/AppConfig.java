package org.bedu.dependencyInjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public Greeting greeting() {
    return new Greeting();
  }
}
