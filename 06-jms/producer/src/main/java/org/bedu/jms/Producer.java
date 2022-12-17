package org.bedu.jms;

import org.bedu.jms.model.Email;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Producer implements CommandLineRunner {

  @Value("${hsbc.exchange}")
  private String TOPIC_EXCHANGE_NAME;

  @Value("${hsbc.routing}")
  private String ROUTING_KEY;

  private RabbitTemplate template;

  @Autowired
  public Producer(RabbitTemplate template) {
    this.template = template;
  }

  @Override
  public void run(String[] args) {
    log.info("Enviando mensaje...");
    template.convertAndSend(TOPIC_EXCHANGE_NAME, ROUTING_KEY,
        new Email("Correo Importante", "paquito@gmail.com", "ofertones@estafas.com", "Tienes una nueva oferta"));
  }
}
