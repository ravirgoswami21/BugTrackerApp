package com.ratepay.app.bugtracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratepay.app.bugtracker.entity.Comment;
import com.ratepay.app.bugtracker.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired CommentRepository commentRepository;

	@Override
	public Comment createComment(Comment comment) {
		return commentRepository.save(comment);
	}

	@Override
	public Comment updateComment(Comment comment) {
		return commentRepository.save(comment);
	}

	@Override
	public Optional<Comment> getCommentById(long commentId) {
		return commentRepository.findById(commentId);
	}

	@Override
	public void deleteComment(long commentId) {
		 commentRepository.deleteById(commentId);
		
	}

	@Override
	public List<Comment> getAllCommentList() {
		return commentRepository.findAll();
	}

	
	}



