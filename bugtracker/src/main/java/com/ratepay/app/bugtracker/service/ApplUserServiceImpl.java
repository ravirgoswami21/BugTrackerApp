package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.entity.Bug;
import com.ratepay.app.bugtracker.repository.ApplUserRepository;
import com.ratepay.app.bugtracker.util.Enums.UserType;

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
	
	@Override
	public int resetPassword(long userId, String Password) {
		return applUserRepository.resetPassoword(userId, Password);
	}

	@Override
	public List<ApplUsers> getAllUserList() {
		return applUserRepository.findAll();
	}

	@Override
	public List<ApplUsers> getAllUserListByUserType(String userType) {
		
		UserType test = Enum.valueOf(UserType.class, userType);
		
		return applUserRepository.findByUserType(test);
	}

	@Override
	public ApplUsers login(String username, String password) {
		List<ApplUsers> app =  applUserRepository.findByUserName(username);
		
		if(app.get(0).getPassword().equals(password))
			return app.get(0);
		else
			throw new RuntimeException();
	}

}
