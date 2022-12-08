package org.bedu.dependencyInjection;

import org.bedu.dependencyInjection.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

  private Person person;

  public DependencyInjectionApplication(Person person) {
    this.person = person;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyInjectionApplication.class, args);
  }

  @PostConstruct
  public void init() {
    person.setName("Juan");
  }

  @Override
  public void run(String[] args) {
    System.out.println(person.greet("Joaquin"));
  }
}
