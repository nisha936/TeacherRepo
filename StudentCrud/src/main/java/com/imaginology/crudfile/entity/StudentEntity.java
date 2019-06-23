package com.imaginology.crudfile.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StudentEntity implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long LCID;
private String StudentName;
@GeneratedValue(strategy= GenerationType.IDENTITY)
private String password;
private String gender;
private String address;

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getLCID() {
	return LCID;
}
public void setLCID(Long lCID) {
	LCID = lCID;
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
