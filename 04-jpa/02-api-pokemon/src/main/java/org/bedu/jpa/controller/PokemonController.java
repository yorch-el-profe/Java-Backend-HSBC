package org.bedu.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.bedu.jpa.entity.Pokemon;
import org.bedu.jpa.service.IPokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
public class PokemonController {

  private IPokemonService service;

  public PokemonController(IPokemonService service) {
    this.service = service;
  }

  @GetMapping("/pokemon")
  @ResponseStatus(HttpStatus.OK)
  public List<Pokemon> getAll() {
    return service.getAll();
  }

  @GetMapping("/pokemon/{number}")
  @ResponseStatus(HttpStatus.OK)
  public Optional<Pokemon> getOneByNumber(@PathVariable("number") int number) {
    return service.getOneByNumber(number);
  }

  @PostMapping("/pokemon")
  @ResponseStatus(HttpStatus.CREATED)
  public Pokemon create(@RequestBody Pokemon pokemon) {
    return service.create(pokemon);
  }
}
