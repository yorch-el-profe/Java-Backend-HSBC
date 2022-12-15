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
