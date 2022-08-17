package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import com.ratepay.app.bugtracker.entity.Bug;
import com.ratepay.app.bugtracker.entity.Project;

public interface ProjectService {
	
	public Project createProject(Project project);
	public Project updateProject(Project project);
	public Optional<Project> getProjectById(long projectId);
	public void deleteProject(long projectId);
	public List<Project> getAllProjectList();

}

