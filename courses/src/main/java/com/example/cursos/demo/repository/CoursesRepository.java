package com.example.cursos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursos.demo.models.Course;

public interface CoursesRepository extends JpaRepository<Course, Long> {
    
}
