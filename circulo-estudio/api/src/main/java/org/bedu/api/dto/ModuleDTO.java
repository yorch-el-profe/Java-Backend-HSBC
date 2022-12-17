package org.bedu.api.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ModuleDTO {
  private long id;
  private String name;
  private Date beginDate;
  private Date createdAt;
  private Date updatedAt;
  private CourseDTO course;
}
