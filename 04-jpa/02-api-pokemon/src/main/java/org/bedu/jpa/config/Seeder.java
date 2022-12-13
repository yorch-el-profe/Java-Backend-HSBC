package org.bedu.jpa.config;

import org.bedu.jpa.repository.IPokemonRepository;
import org.bedu.jpa.repository.ITrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.bedu.jpa.entity.Pokemon;
import org.bedu.jpa.entity.Trainer;

@Component
public class Seeder implements CommandLineRunner {

  private IPokemonRepository pokemonRepository;
  private ITrainerRepository trainerRepository;

  @Autowired
  public Seeder(IPokemonRepository pokemonRepository, ITrainerRepository trainerRepository) {
    this.pokemonRepository = pokemonRepository;
    this.trainerRepository = trainerRepository;
  }

  @Override
  public void run(String[] args) {
    Pokemon pikachu = pokemonRepository.findOneByNumber(25);

    if (pikachu == null) {
      Pokemon p = new Pokemon();
      p.setName("Pikachu");
      p.setNumber(25);

      pokemonRepository.save(p);
    }

    Trainer ash = trainerRepository.findOneByName("Ash Ketchup");

    if (ash == null) {
      Trainer t = new Trainer();
      t.setName("Ash Ketchup");

      trainerRepository.save(t);
    }
  }
}
