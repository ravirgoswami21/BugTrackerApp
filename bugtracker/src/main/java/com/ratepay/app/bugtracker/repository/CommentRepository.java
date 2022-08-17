package com.ratepay.app.bugtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ratepay.app.bugtracker.entity.Comment;
import com.ratepay.app.bugtracker.entity.Project;


	@Repository
	public interface CommentRepository extends JpaRepository<Comment, Long> {

	}


