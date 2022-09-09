package com.example.cursos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursos.demo.models.Career;

public interface CareerRepository  extends JpaRepository<Career, Long>{
    
}
