package org.bedu.jpa.repository;

import org.bedu.jpa.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainerRepository extends JpaRepository<Trainer, Long> {

  Trainer findOneByName(String name);
}
