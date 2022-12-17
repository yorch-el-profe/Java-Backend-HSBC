package org.bedu.api.service;

import java.util.List;
import java.util.Optional;

import org.bedu.api.dto.CourseDTO;

public interface CourseService {

  List<CourseDTO> findAll();

  Optional<CourseDTO> findById(long id);

  CourseDTO save(CourseDTO data);

  void update(long id, CourseDTO data) throws Exception;

  void delete(long id) throws Exception;
}
