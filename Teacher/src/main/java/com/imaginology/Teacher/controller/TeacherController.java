package com.imaginology.Teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.Teacher.entity.Teacher;
import com.imaginology.Teacher.entity.TeacherNotFoundException;
import com.imaginology.Teacher.service.TeacherService;
import com.imaginology.Teacher.teacherDto.TeacherDto;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	
	
	@PostMapping("/teachers")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Teacher createTeacherDetails(@RequestBody TeacherDto teacher) {
		return teacherService.createTeacherDetails(teacher);
	}
	
	
	@GetMapping("/{teacherId}")
	@ResponseStatus(code=HttpStatus.OK)
	private Teacher getTeacher(@PathVariable Long teacherId) {
		return teacherService.getTeacherDetails(teacherId);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Teacher>getAllTeachers(){
		return teacherService.getAllTeachers();
	}
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	private void teacherNotFoundHandler(TeacherNotFoundException ex) {
		
	}
	
	@DeleteMapping("/{teacherId}")
	public void deleteTeacher(@PathVariable Long teacherId) {
		teacherService.deleteTeacher(teacherId);
	}
}
