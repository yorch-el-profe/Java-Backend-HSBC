package org.bedu.jms.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Email {

  private String subject;
  private String to;
  private String from;
  private String body;
}
