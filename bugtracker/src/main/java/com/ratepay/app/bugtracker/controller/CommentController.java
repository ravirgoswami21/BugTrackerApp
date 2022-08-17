package com.ratepay.app.bugtracker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ratepay.app.bugtracker.entity.Comment;
import com.ratepay.app.bugtracker.entity.Project;
import com.ratepay.app.bugtracker.exception.ResourceNotFoundException;
import com.ratepay.app.bugtracker.service.CommentService;

@RestController
@RequestMapping("/rpay/comment")
public class CommentController {

	
	@Autowired CommentService commentService;
	
	@PostMapping("/create")
	public Comment createProject(@RequestBody Comment comment) {
		return commentService.createComment(comment);
	}
	
	@PostMapping("/update")
	public Comment updateProject(@RequestBody Comment comment) {
		return commentService.updateComment(comment);
	}
	
	@GetMapping("/getById")
	public Optional<Comment> getCommentById(@RequestParam("id") Long commentId) throws ResourceNotFoundException {
		Optional<Comment> comment = commentService.getCommentById(commentId);	
		if(comment == null) {
			throw new ResourceNotFoundException();
		}
		return commentService.getCommentById(commentId);
	}
	
	@GetMapping("/getAll")
	public List<Comment> getallComment() {
		return commentService.getAllCommentList();
	}
	
	@DeleteMapping("/deletebyId/{id}")
	public void deleteComment(@PathVariable("id") Long comment) {
		commentService.deleteComment(comment);
	}
}
