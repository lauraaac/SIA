package com.example.cursos.demo.dto;

public class CourseDTO {

    private Long idCourse;
    private String name;
    private String description;
	private Long idCareer;


    public Long getIdCourse() {
        return this.idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdCareer() {
        return this.idCareer;
    }

    public void setIdCareer(Long idCareer) {
        this.idCareer = idCareer;
    }

    
}
