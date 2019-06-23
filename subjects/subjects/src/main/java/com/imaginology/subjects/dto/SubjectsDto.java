package com.imaginology.subjects.dto;

import java.io.Serializable;

public class SubjectsDto implements Serializable {
	private String subjectName;
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
