package com.example.cursos.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "group")
public class Group {


    @Id
	@Column(name = "id_group", unique = true, nullable = false)
	private int idGroup;

    @Column(name = "horario")
    private String horario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_teacher")
	private Teacher teacher;


    public int getIdGroup() {
        return this.idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }





    
}
