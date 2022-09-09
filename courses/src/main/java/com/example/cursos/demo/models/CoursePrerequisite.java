package com.example.cursos.demo.models;

import javax.persistence.*;


@Entity
@Table(name = "course_prerequisite")

public class CoursePrerequisite {

    @Id
	@Column(name = "id_course_prerequisite", unique = true, nullable = false)
	private int idCoursePrerequisite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_course")
	private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prerequisite")
	private Course prerequisite;



    public int getIdCoursePrerequisite() {
        return this.idCoursePrerequisite;
    }

    public void setIdCoursePrerequisite(int idCoursePrerequisite) {
        this.idCoursePrerequisite = idCoursePrerequisite;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getPrerequisite() {
        return this.prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }
    
}
