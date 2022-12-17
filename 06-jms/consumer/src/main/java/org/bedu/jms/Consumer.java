package org.bedu.jms;

import org.bedu.jms.model.Email;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Consumer {

  @RabbitListener(queues = { "${hsbc.queue}" })
  public void consume(Email email) {
    log.info("Mensaje recibido...");
    log.info(email.toString());
  }
}
