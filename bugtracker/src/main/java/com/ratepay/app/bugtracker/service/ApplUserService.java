package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.entity.Bug;

@Service
public interface ApplUserService {
	
	public ApplUsers createUser(ApplUsers applUsers);
	public ApplUsers updateUser(ApplUsers applUsers);
	public Optional<ApplUsers> getUserById(long applUsersId);
	public void deleteUser(long applUsersId);

}
