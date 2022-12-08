package org.bedu.dependencyInjection.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String greet(String anotherName) {
    return "Hello, " + anotherName + " my name is " + name;
  }
}
