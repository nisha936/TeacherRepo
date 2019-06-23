package com.imaginology.subjects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.subjects.dto.SubjectsDto;
import com.imaginology.subjects.entity.Subjects;
import com.imaginology.subjects.service.SubjectsService;

@RestController
@RequestMapping("/subjects")
public class SubjectsController {
	
	@Autowired
	SubjectsService subjectsService;

	@RequestMapping(value="/getallsubjects",method=RequestMethod.GET)
	public List<Subjects> getAllSubjects(){
		return subjectsService.getAllSubjects();
	}
	
	@RequestMapping(value="/{subjectCode}",method=RequestMethod.GET)
	public SubjectsDto getSubjects(@PathVariable("subjectCode") Long subjectCode) {
		return subjectsService.getSubject(subjectCode);
	}
	
	@RequestMapping(value="/{subjectCode}",method=RequestMethod.DELETE)
	public void deleteSubject(@PathVariable Long subjectCode) {
		subjectsService.deleteSubject(subjectCode);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<Subjects> createSubject(@RequestBody SubjectsDto subjects){
		return subjectsService.createSubject(subjects);
	}
	
	@RequestMapping(value="/subjectdata", method=RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.CREATED)
	public List<Subjects> createSubjectsData(@RequestBody SubjectsDto subjectsDto){
		return subjectsService.createSubject(subjectsDto);
	}
}

