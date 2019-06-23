package com.imaginology.crudfile.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.crudfile.entity.StudentEntity;
import com.imaginology.crudfile.service.StudentService;

@RestController
@RequestMapping("/studentEntities")
public class StudentController {
	
@Autowired
StudentService studentService;

@GetMapping
public List<StudentEntity> getAllStudentEntities(){
	return studentService.getAllStudentEntities();
}


@DeleteMapping("/{id}")
public void deleteStudentEntity(@PathVariable Long id) {
	studentService.deleteStudentEntity(id);
}

@PostMapping
@ResponseStatus(code=HttpStatus.CREATED)
public List<StudentEntity> createStudentEntity( @RequestBody StudentEntity studentEntity){
	return studentService.createStudent( studentEntity);
}
}


