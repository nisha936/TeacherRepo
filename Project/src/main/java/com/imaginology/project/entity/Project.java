package com.imaginology.project.entity;

public class Project {
	Long projectId;
	String projectName;
	String projectManager;
	public Project(Long projectId, String projectName, String projectManager) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectManager = projectManager;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	
	
}
