package com.ratepay.app.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Comment")

public class Comment extends BaseEntity {
	
	@Id
	private long id;
	private String comment;
	
	@OneToOne
	private ApplUsers applUsers;
	

}
