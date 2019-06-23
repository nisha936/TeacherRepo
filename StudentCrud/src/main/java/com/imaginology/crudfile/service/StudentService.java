package com.imaginology.crudfile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.crudfile.entity.StudentEntity;
import com.imaginology.crudfile.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<StudentEntity> createStudent(StudentEntity studentEntity){
		studentRepository.save(studentEntity);
		List<StudentEntity> studentEntities = studentRepository.findAll();
		return studentEntities;
		}
	
	public List<StudentEntity> getAllStudentEntities(){
		return studentRepository.findAll();
	}
	 
	public void deleteStudentEntity(Long id) {
		studentRepository.deleteById(id);
	}

 

}