package com.imaginology.subjects.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects implements Serializable {
 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String subjectName;
	@Id
	private Long subjectCode;
	private String subjectTeacher;
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Long getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(Long subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectTeacher() {
		return subjectTeacher;
	}
	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}

}
