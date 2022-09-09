package com.example.cursos.demo.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.cursos.demo.dto.CourseDTO;
import com.example.cursos.demo.mapper.CourseMapper;
import com.example.cursos.demo.models.Career;
import com.example.cursos.demo.models.Course;
import com.example.cursos.demo.repository.CareerRepository;
import com.example.cursos.demo.repository.CoursesRepository;

@Service
public class CourseService{

    @Autowired   
    CoursesRepository coursesRepository;

    @Autowired
    CareerRepository careerRepository;

    @Autowired
    CourseMapper courseMapper;



    public Map<String, Object> getCourses() {
        Map<String, Object> answer = new TreeMap<>();
        List<Course> courses = coursesRepository.findAll();

        answer.put("exitoso", true);
        answer.put("cursos", courses);

        return null;
    }

    public Map<String, Object> getCareers() {
        Map<String, Object> answer = new TreeMap<>();
        List<Career> careers = careerRepository.findAll();

        answer.put("success", true);
        answer.put("careers", careers);

        return answer;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public Map<String, Object> createCourse(CourseDTO courseDTO) {
        Map<String, Object> answer = new TreeMap<>();
        Course course = courseMapper.courseDTOToCourse(courseDTO);
        coursesRepository.save(course);
        answer.put("success", true);
        answer.put("message", "course has been created");
        return answer;
    }


    
}
