package org.bedu.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

  private static Logger logger = LoggerFactory.getLogger(Runner.class);

  /*
   * DEBUG: Mensajes no tan importantes
   * INFO: Cosas importantes que pasan en el código
   * WARN: Problemas recuperables
   * ERROR: Problemas irrecuperables
   */
  @Override
  public void run(String[] args) {
    String name = "Demo de Loggers";

    logger.info("Aplicación de Spring Boot inicializada");
    logger.warn("El método debe recibir una cadena no vacía");
    logger.error("Hubo un problema crítico en la app");
    logger.debug("App: {}", name);
  }
}

/**
 * Ejercicio:
 * Crear una clase llamada Primos que valide si un numero N es primo.
 * Un número primo es aquel que es divisible por la unidad y si mismo.
 * 2,3,5,7,11,13,...
 * 
 * Utilizar un logger INFO si el número efectivamente es primo
 * Utilizar un logger ERROR si el número es negativo
 * Utilizar un logger WARN si el número no es primo
 * 
 * Crear un método run (CommandLineRunner) para probar el código
 */