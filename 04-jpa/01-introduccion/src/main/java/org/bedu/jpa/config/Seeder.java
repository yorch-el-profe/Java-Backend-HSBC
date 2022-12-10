package org.bedu.jpa.config;

import org.bedu.jpa.model.Person;
import org.bedu.jpa.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

  private IPersonRepository repository;

  @Autowired
  public Seeder(IPersonRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String[] args) {
    Person p1 = new Person();
    p1.setName("Carlos");
    p1.setLastName("Elizalde");

    Person p2 = new Person();
    p2.setName("Joaquin");
    p2.setLastName("Ballarta");

    repository.save(p1);
    repository.save(p2);
  }
}
