package com.example.cursos.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "course")
public class Course implements java.io.Serializable{

    @Id
    @GeneratedValue
	@Column(name = "id_course", unique = true, nullable = false)
	private Long idCourse;


    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_career")
	private Career career;


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

    public Career getCareer() {
        return this.career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    
}
