package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratepay.app.bugtracker.entity.Bug;
import com.ratepay.app.bugtracker.repository.BugRepository;

@Service
public class BugServiceImpl implements BugService {
	
	
	@Autowired BugRepository bugRepository;
	
	@Override
	public Bug createBug(Bug Bug) {
		return bugRepository.save(Bug);
	}

	@Override
	public Bug updateBug(Bug Bug) {
		return bugRepository.save(Bug);
	}

	@Override
	public void deleteBug(long bugId) {
		bugRepository.deleteById(bugId);
	}

	@Override
	public Bug updateBugStatus(Bug bug) {
		return bugRepository.save(bug);
	}

	@Override
	public Bug updateBugAssignee(Bug bug) {
		return bugRepository.save(bug);
	}

//	@Override
//	public Bug addBugComment(Bug bug) {
//		bugRepository.save(bug);
//		return false;
//	}

	@Override
	public List<Bug> getAllBugList() {
		return bugRepository.findAll();
	}

	@Override
	public List<Bug> getAllOpenedBugList() {
		return bugRepository.findAll();
	}

	@Override
	public List<Bug> getAllBugListByUser(long userId) {
		bugRepository.findAll();
		return null;
	}

	@Override
	public List<Bug> getAllOpenBugListByUser(long userId) {
		return bugRepository.findAll();
	}

	@Override
	public Optional<Bug> getBugById(long id) {
		return bugRepository.findById(id);
	}

}
