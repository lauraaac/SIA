package com.example.cursos.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
	@Column(name = "id_teacher", unique = true, nullable = false)
	private int idTeacher;

    @Column(name = "name")
	private String name;


    public int getIdTeacher() {
        return this.idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }




    
}
