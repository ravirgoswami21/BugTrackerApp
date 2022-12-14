package com.ratepay.app.bugtracker.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.entity.Project;
import com.ratepay.app.bugtracker.exception.ResourceNotFoundException;
import com.ratepay.app.bugtracker.service.ProjectService;

@RestController
@RequestMapping("/rpay/project")
public class ProjectController {
	
	
	@Autowired ProjectService projectService;
	
	@PostMapping("/create")
	public Project createProject(@RequestBody Project project) {
		return projectService.createProject(project);
	}
	
	@PostMapping("/update")
	public Project updateProject(@RequestBody Project project) {
		return projectService.updateProject(project);
	}
	
	@GetMapping("/getById")
	public Optional<Project> getProjectById(@RequestParam("id") Long projectId) throws ResourceNotFoundException {
		Optional<Project> project = projectService.getProjectById(projectId);	
		if(project == null) {
			throw new ResourceNotFoundException();
		}
		return projectService.getProjectById(projectId);
	}
	
	@GetMapping("/getAll")
	public List<Project> getallProject() {
		return projectService.getAllProjectList();
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteProject(@PathVariable("id") Long project) {
		projectService.deleteProject(project);
	}

}
