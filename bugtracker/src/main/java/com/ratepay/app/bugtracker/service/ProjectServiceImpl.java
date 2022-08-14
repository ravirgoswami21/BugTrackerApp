package com.ratepay.app.bugtracker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratepay.app.bugtracker.entity.Project;
import com.ratepay.app.bugtracker.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired ProjectRepository projectRepository;
	
	@Override
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Optional<Project> getProjectById(long projectId) {
		return projectRepository.findById(projectId);
	}

	@Override
	public void deleteProject(long projectId) {
		projectRepository.deleteById(projectId);
	}

}
