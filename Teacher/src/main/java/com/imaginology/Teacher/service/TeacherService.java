package com.imaginology.Teacher.service; 

import java.util.List;

import org.springframework.stereotype.Service;

import com.imaginology.Teacher.entity.Teacher;
import com.imaginology.Teacher.entity.TeacherNotFoundException;
import com.imaginology.Teacher.repository.TeacherRepository;
import com.imaginology.Teacher.teacherDto.TeacherDto;



@Service
public class TeacherService {
	private TeacherRepository teacherRepository;
	
	Teacher teacher;
	
	public TeacherService(TeacherRepository teacherRepository) {
	this.teacherRepository = teacherRepository;
	}

	public Teacher getTeacherDetails(long teacherId) {
		Teacher teacher = teacherRepository.findByTeacherId(teacherId);
		if (teacher == null) {
			throw new TeacherNotFoundException();
		}
		return teacher;
	}


	public Teacher createTeacherDetails(TeacherDto t) {
		Teacher teacher = new Teacher();
		
		  teacher.setId(teacher.getId()); teacher.setTeacherId(teacher.getTeacherId());
		  teacher.setName(teacher.getName()); teacher.setCourse(teacher.getCourse());
		  teacher.setSubject(teacher.getSubject());
		Teacher savedTeacher = teacherRepository.save(teacher);
		return savedTeacher;
	}
	
	public List<Teacher> getAllTeachers() {
		return (List<Teacher>) teacherRepository.findAll();
	}
	
	public void deleteTeacher(Long teacherId) {
		teacherRepository.deleteById(teacherId);
	}
	
}
