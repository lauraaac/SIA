package com.example.cursos.demo.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cursos.demo.dto.CourseDTO;
import com.example.cursos.demo.service.CourseService;


@RestController
@RequestMapping("/service")
@CrossOrigin(origins = "*")
public class coursesController {

    @Autowired CourseService courseService;


    @GetMapping("getCourses")
    public ResponseEntity<?> getCourses() {
        Map<String, Object> answer = new TreeMap<>();
        try {
            answer = courseService.getCourses();
        } catch (Exception e) {
            answer.put("exitoso", false);
            answer.put("error", "Se ha presentado un error en el servicio");
            answer.put("e",e);
        }
        return ResponseEntity.ok().body(answer);
    }

    @GetMapping("/getCareers")
    public ResponseEntity<?> getCareers() {
        Map<String, Object> answer = new TreeMap<>();
        try {
            answer = courseService.getCareers();
        } catch (Exception e) {
            answer.put("exitoso", false);
            answer.put("error", "Se ha presentado un error en el servicio");
            answer.put("e",e);
        }
        return ResponseEntity.ok().body(answer);
    }

    @PostMapping("/createCourse")
    public ResponseEntity<?> createCourse(@RequestBody CourseDTO courseDTO) {
        Map<String, Object> answer = new TreeMap<>();
        try {
            answer = courseService.createCourse(courseDTO);
        } catch (Exception e) {
            answer.put("exitoso", false);
            answer.put("error", "Se ha presentado un error en el servicio");
            answer.put("e",e);

        }

        return ResponseEntity.ok().body(answer);
    }



    
}
