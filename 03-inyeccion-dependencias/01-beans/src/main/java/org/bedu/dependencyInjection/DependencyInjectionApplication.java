package org.bedu.dependencyInjection;

import org.bedu.dependencyInjection.config.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

  private Greeting greeting;

  @Autowired
  public DependencyInjectionApplication(Greeting gretting) {
    this.greeting = gretting;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyInjectionApplication.class, args);
  }

  @Override
  public void run(String[] args) throws Exception {
    System.out.println(greeting.greet("Alex"));
  }
}
