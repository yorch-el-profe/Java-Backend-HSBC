package org.bedu.api.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.bedu.api.dto.CourseDTO;
import org.bedu.api.entity.Course;
import org.bedu.api.mapper.CourseMapper;
import org.bedu.api.repository.CourseRepository;
import org.bedu.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

  private CourseMapper mapper;
  private CourseRepository repository;

  @Autowired
  public CourseServiceImpl(CourseMapper mapper, CourseRepository repository) {
    this.mapper = mapper;
    this.repository = repository;
  }

  public List<CourseDTO> findAll() {
    List<Course> courses = repository.findAll();

    // Versión imperativa
    List<CourseDTO> mappedCourses = new LinkedList<>();

    for (Course c : courses) {
      mappedCourses.add(mapper.toDTO(c));
    }

    return mappedCourses;

    // Versión funcional
    // return courses.stream().map(mapper::toDTO).toList();
  }

  public Optional<CourseDTO> findById(long id) {
    return null;
  }

  public CourseDTO save(CourseDTO data) {
    Course entity = mapper.toEntity(data);
    return mapper.toDTO(repository.save(entity));
  }

  public void update(long id, CourseDTO data) throws Exception {
    Optional<Course> result = repository.findById(id);

    if (result.isEmpty()) {
      throw new Exception("No existe curso");
    }

    Course course = result.get();

    course.setName(data.getName());

    repository.save(course);
  }

  public void delete(long id) throws Exception {
    Optional<Course> result = repository.findById(id);

    if (result.isEmpty()) {
      throw new Exception("No existe curso");
    }

    repository.deleteById(id);
  }
}
