package com.imaginology.project.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.imaginology.project.entity.Project;

@Service
public class ProjectService {
	    @Cacheable("project")
	    public Project getProjectByProjectId(Long projectId)
	    {
	        try
	        {
	            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
	            Thread.sleep(1000*5);
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	 
	        return new Project(001L,"SringCache","Nisha");
	    }
	}

