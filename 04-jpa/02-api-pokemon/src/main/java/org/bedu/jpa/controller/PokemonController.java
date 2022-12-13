package org.bedu.jpa.controller;

import java.util.List;

import org.bedu.jpa.entity.Pokemon;
import org.bedu.jpa.service.IPokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

  private IPokemonService service;

  public PokemonController(IPokemonService service) {
    this.service = service;
  }

  @GetMapping("/getAllPokemon")
  public List<Pokemon> getAll() {
    return service.getAll();
  }

  @GetMapping("/getOnePokemon/{number}")
  public Pokemon getOneByNumber(@PathVariable("number") int number) {
    return service.getOneByNumber(number);
  }
}
