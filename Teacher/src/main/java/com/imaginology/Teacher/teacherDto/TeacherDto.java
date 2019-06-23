package com.imaginology.Teacher.teacherDto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TeacherDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Long teacherId;
	private String name;
	private String subject;
	private String course;
	
	public TeacherDto() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public TeacherDto(Long teacherId, String name, String subject, String course) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.subject = subject;
		this.course = course;
	}
}

