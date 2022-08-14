package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import com.ratepay.app.bugtracker.entity.Bug;

public interface BugService {
	public Bug createBug(Bug bug);
	public Bug updateBug(Bug bug);
	public void deleteBug(long bugId);
	
	public Bug updateBugStatus(Bug bug);
	public Bug updateBugAssignee(Bug bug);
	//public Bug addBugComment(Bug bug);
	
	public List<Bug> getAllBugList(); //pagination
	public List<Bug> getAllOpenedBugList(); 
	public List<Bug> getAllBugListByUser(long userId);
	public List<Bug> getAllOpenBugListByUser(long userId);
	
	public Optional<Bug> getBugById(long id);
}
