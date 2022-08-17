package com.ratepay.app.bugtracker.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.entity.Bug;
import com.ratepay.app.bugtracker.service.BugService;
import com.ratepay.app.bugtracker.util.Enums.DefectStatus;

@RestController
@RequestMapping("/rpay/bug")
public class BugController {
	
	@Autowired BugService bugService;
	
	@PostMapping("/create")
	public Bug createbug(@RequestBody Bug bug) {
		return bugService.createBug(bug);
	}
	
	@PostMapping("/update")
	public Bug updatebug(@RequestBody Bug bug) {
		return bugService.updateBug(bug);
	}
	
	@DeleteMapping("/delete")
	public void deletebug(@PathParam("id") Long bugId) {
		 bugService.deleteBug(bugId);
	}
	
	@PostMapping("/updateBugStatus")
	public String updateBugStatus(@RequestParam("id") long bugId,@RequestParam("status") DefectStatus defectStatus ) {
		//BugService.updateBugStatus(bug);
		return "Greetings from RatePay Bugtracker Application!";
	}
	
	
	@PostMapping("/updateBugAssignee")
	public String updateBugAssignee(@RequestParam("id") long bugId,@RequestParam("appluserId") long appluserId) {
		//BugService.updateBugAssignee(bug);
		return "Greetings from RatePay Bugtracker Application!";
	}
	
	
//	@PostMapping("/")
//	public String addBugComment(@RequestBody Bug bug) {
//		//BugService.addBugComment(bug);
//		return "Greetings from RatePay Bugtracker Application!";
//	}
	
	@GetMapping("/getAllBugList")
	public List<Bug> getAllBugList() {
		return bugService.getAllBugList();
	}
	
	@GetMapping("/getAllOpenedBugList")
	public List<Bug> getAllOpenedBugList() {
		return bugService.getAllOpenedBugList();
	}
	
	@GetMapping("/getAllBugListByUser")
	public List<Bug> getAllBugListByUser(@RequestParam("appluserId") long appluserId) {
		return bugService.getAllBugListByUser(appluserId);
	}
	
	
	@GetMapping("/getAllOpenBugListByUser")
	public List<Bug> getAllOpenBugListByUser(@RequestParam("appluserId") long appluserId) {
		return bugService.getAllOpenBugListByUser(appluserId);
	}
}
