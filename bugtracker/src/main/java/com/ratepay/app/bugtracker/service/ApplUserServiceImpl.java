package com.ratepay.app.bugtracker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.entity.Bug;
import com.ratepay.app.bugtracker.repository.ApplUserRepository;

@Service
public class ApplUserServiceImpl implements ApplUserService {
	
	@Autowired 
	ApplUserRepository applUserRepository;

	public ApplUsers createUser(ApplUsers applUsers) {
		return applUserRepository.save(applUsers);
	}

	@Override
	public ApplUsers updateUser(ApplUsers applUsers) {
		return applUserRepository.save(applUsers);
	}

	@Override
	public Optional<ApplUsers> getUserById(long applUsersId) {
		return applUserRepository.findById(applUsersId);
	}

	@Override
	public void deleteUser(long applUsersId) {
		applUserRepository.deleteById(applUsersId);
	}

}
