package com.ratepay.app.bugtracker.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/rpay/user")
public class ApplUserController {

	@Autowired 
	ApplUserService applUserService;
	
	@PostMapping("/create")
	public ApplUsers createUser(@Valid @RequestBody  ApplUsers applUsers) {
		
		ApplUsers app = null;
		try {
			app = applUserService.createUser(applUsers);
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return app;
	}
	
	@PostMapping("/update")
	public ApplUsers updateUser(@Valid @RequestBody  ApplUsers applUsers) {
		return applUserService.updateUser(applUsers);
	}
	
	@GetMapping("/getById")
	public Optional<ApplUsers> getUserById(@RequestParam("id")  Long applUsersId) {
		return applUserService.getUserById(applUsersId);
		
	}
	
	@GetMapping("/login")
	public ApplUsers login(@RequestParam("username")  String username,@RequestParam("password")  String passowrd) {
		return applUserService.login(username, passowrd);
		
	}


	@GetMapping("/getAll")
	public List<ApplUsers> getAllUser() {
		return applUserService.getAllUserList();
	}

	@GetMapping("/getAllUserByUserType")
	public List<ApplUsers> getAllUserByUserType(String userType) {
		return applUserService.getAllUserListByUserType(userType);
	}
	
	@PostMapping("/resetPassword")
	public int resetPassword(@RequestParam("id")  Long applUsersId,@RequestParam("password")  String passowrd) {
		return applUserService.resetPassword(applUsersId,passowrd);
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteUser(@PathVariable("id") int applUsers) {
		try {
			applUserService.deleteUser(applUsers);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
