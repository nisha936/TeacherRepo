package com.imaginology.subjects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginology.subjects.dto.SubjectsDto;
import com.imaginology.subjects.entity.Subjects;
import com.imaginology.subjects.repository.SubjectsRepository;

@Service
public class SubjectsService {
	
	@Autowired
	SubjectsRepository subjectsRepository;
   
	public List<Subjects> createSubject(SubjectsDto subjectsDto){
		Subjects subjects= new Subjects();
		subjects.setSubjectName(subjectsDto.getSubjectName());
		subjects.setSubjectCode(subjectsDto.getSubjectCode());
		subjects.setSubjectTeacher(subjectsDto.getSubjectTeacher());
		subjectsRepository.save(subjects);
		List<Subjects> subject = subjectsRepository.findAll();
		return subject;
	}
	
	public List<Subjects> getAllSubjects(){
		return subjectsRepository.findAll();
	}
	
	public void deleteSubject(Long subjectCode) {
		subjectsRepository.deleteById(subjectCode);
	}
	
	public SubjectsDto getSubject(Long subjectCode) {
		Subjects subjects = subjectsRepository.getOne(subjectCode);
		SubjectsDto subjectsDto = new SubjectsDto();
		subjectsDto.setSubjectCode(subjects.getSubjectCode());
		subjectsDto.setSubjectName(subjects.getSubjectName());
		subjectsDto.setSubjectTeacher(subjects.getSubjectTeacher());
		return subjectsDto;
	}
}
