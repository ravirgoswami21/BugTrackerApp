package com.ratepay.app.bugtracker.controller;

import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ratepay.app.bugtracker.dto.ApplUsersDTO;
import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.mapper.MapperService;
import com.ratepay.app.bugtracker.service.ApplUserService;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
//@RequestMapping("/api")
public class ApplUserController {

	@Autowired 
	ApplUserService applUserService;
	
	@PostMapping("/createUser")
	public ApplUsers createUser(@RequestBody  ApplUsers applUsers) {
		
		//ApplUsersDTO app1= Mappers.getMapper(MapperService.cl).ApplUserstoApplUSerDTO(applUsers);
		
		ApplUsers app = null;
		try {
			app = applUserService.createUser(applUsers);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return app;
	}
	
	@PostMapping("/updateUser")
	public ApplUsers updateUser(@RequestBody  ApplUsers applUsers) {
		return applUserService.createUser(applUsers);
	}
	
	@GetMapping("/getUserById")
	public Optional<ApplUsers> getUserById(@RequestParam("id")  Long applUsersId) {
		return applUserService.getUserById(applUsersId);
		
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@PathParam("id") Long applUsers) {
		applUserService.deleteUser(applUsers);
	}
}
