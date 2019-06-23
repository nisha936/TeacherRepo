package com.imaginology.crudfile.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
	private Long lcid;
	private String StudentName;
	private String password;
	private String gender;
	public Long getLcid() {
		return lcid;
	}
	public void setLcid(Long lcid) {
		this.lcid = lcid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
