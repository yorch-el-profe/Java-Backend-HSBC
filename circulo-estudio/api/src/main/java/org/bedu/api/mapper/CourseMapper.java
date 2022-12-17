package org.bedu.api.mapper;

import org.bedu.api.dto.CourseDTO;
import org.bedu.api.entity.Course;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CourseMapper {

  CourseDTO toDTO(Course data);

  Course toEntity(CourseDTO data);
}
