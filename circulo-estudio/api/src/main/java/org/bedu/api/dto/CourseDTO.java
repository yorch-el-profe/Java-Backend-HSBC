package org.bedu.api.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CourseDTO {
  private long id;
  private String name;
  private Date createdAt;
  private Date updatedAt;
}
