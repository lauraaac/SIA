package com.example.cursos.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "career")
public class Career{

    @Id
	@Column(name = "id_career", unique = true, nullable = false)
	private Long idCareer;


    @Column(name = "name")
    private String name;



    public Long getIdCareer() {
        return this.idCareer;
    }

    public void setIdCareer(Long idCareer) {
        this.idCareer = idCareer;
    }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

