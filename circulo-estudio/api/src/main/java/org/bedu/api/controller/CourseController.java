package org.bedu.api.controller;

import java.util.List;

import org.bedu.api.dto.CourseDTO;
import org.bedu.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

  private CourseService service;

  @Autowired
  public CourseController(CourseService service) {
    this.service = service;
  }

  @GetMapping
  public List<CourseDTO> findAll() {
    return service.findAll();
  }

  @PostMapping
  public CourseDTO save(@RequestBody CourseDTO data) {
    return service.save(data);
  }
}
