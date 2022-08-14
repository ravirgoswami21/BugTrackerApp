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

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.service.ApplUserService;


@RestController
public class ApplUserController {

	@Autowired 
	ApplUserService applUserService;
	
	@PostMapping("/createUser")
	public ApplUsers createUser(@RequestBody  ApplUsers applUsers) {
		return applUserService.createUser(applUsers);
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
