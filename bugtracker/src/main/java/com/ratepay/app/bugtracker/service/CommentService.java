package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import com.ratepay.app.bugtracker.entity.Comment;
import com.ratepay.app.bugtracker.entity.Project;

public interface CommentService {
	
	public Comment createComment(Comment comment);
	public Comment updateComment(Comment comment);
	public Optional<Comment> getCommentById(long commentId);
	public void deleteComment(long commentId);
	public List<Comment> getAllCommentList();

}
