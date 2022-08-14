package com.ratepay.app.bugtracker.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ratepay.app.bugtracker.entity.Project;
import com.ratepay.app.bugtracker.exception.ResourceNotFoundException;
import com.ratepay.app.bugtracker.service.ProjectService;

@RestController
public class ProjectController {
	
	
	@Autowired ProjectService projectService;
	
	@PostMapping("/createProject")
	public Project createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@PostMapping("/updateProject")
	public Project updateProject(@RequestBody Project project) {
		return projectService.updateProject(project);
	}
	
	@GetMapping("/getProjectById")
	public Optional<Project> getProjectById(@RequestParam("id") Long projectId) throws ResourceNotFoundException {
		Optional<Project> project = projectService.getProjectById(projectId);	
		if(project == null) {
			throw new ResourceNotFoundException();
		}
		return projectService.getProjectById(projectId);
	}
	
	@DeleteMapping("/deleteProject/{id}")
	public void deleteProject(@PathParam("id") Long project) {
		projectService.deleteProject(project);
	}

}
