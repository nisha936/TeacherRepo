package com.imaginology.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.imaginology.project.entity.Project;
import com.imaginology.project.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("projects/{projectId}")
	public Project findProjectByProjectId(@PathVariable long projectId) {
		System.out.println("Searching by projectId :: " + projectId);
		
		return projectService.getProjectByProjectId(projectId);
	}
	

}
