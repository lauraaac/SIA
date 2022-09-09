package com.example.cursos.demo.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.cursos.demo.dto.CourseDTO;
import com.example.cursos.demo.models.Course;

@Mapper
public interface CourseMapper {
    
    @Mapping(source = "idCareer", target = "career.idCareer")
    public Course courseDTOToCourse (CourseDTO courseDTO);

    @Mapping(source = "career.idCareer", target = "idCareer")
    public CourseDTO courseToCourseDTO (Course course);
}
