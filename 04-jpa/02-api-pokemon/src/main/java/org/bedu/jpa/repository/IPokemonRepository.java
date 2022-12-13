package org.bedu.jpa.repository;

import java.util.Optional;

import org.bedu.jpa.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {

  // JPQL
  // @Query("SELECT p FROM Pokemon p WHERE p.number = :number")
  // SQL
  // @Query(value = "SELECT * FROM Pokemon WHERE number = :number", nativeQuery =
  // true)
  Optional<Pokemon> findOneByNumber(int number);

  // Named Queries
  // findByCampo1AndCampo2AndCampo3...
  // findOneByCampo1AndCampo2AndCampo3...
  // findByCampo1OrCampo2
}
