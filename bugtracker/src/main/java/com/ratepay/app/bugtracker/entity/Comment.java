package com.ratepay.app.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Comment")

public class Comment extends BaseEntity {
	
	@Id
	private long id;
	
	@NotNull(message = "Comment can not be null")
	@Min(value=8, message = "Comment should be of minimum 8 value")
	@Max(value=100, message = "Comment should not be of more than 50 value")
	private String comment;
	
	@OneToOne
	private ApplUsers applUsers;
	

}
