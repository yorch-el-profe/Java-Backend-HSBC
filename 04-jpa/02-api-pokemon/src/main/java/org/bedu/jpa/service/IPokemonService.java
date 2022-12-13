package org.bedu.jpa.service;

import java.util.List;

import org.bedu.jpa.entity.Pokemon;

public interface IPokemonService {

  List<Pokemon> getAll();

  Pokemon getOneByNumber(int number);
}
