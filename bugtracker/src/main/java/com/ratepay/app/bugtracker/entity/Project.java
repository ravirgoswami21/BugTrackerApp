package com.ratepay.app.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Project")
public class Project extends BaseEntity {
	
	@Id
	private long id;
	
	@NotNull(message = "Cade can not be null")
	@Min(value=3, message = "Cade should be of minimum 3 value")
	@Max(value=5, message = "Cade can not be null")
	private String code;
	
	@NotNull(message = "Name can not be null")
	@Min(value=5, message = "Name should be of minimum 3 value")
	@Max(value=20, message = "Name should not be of more than 20 value")
	private String name;
	
	@NotNull(message = "Description can not be null")
	@Min(value=8, message = "Description should be of minimum 3 value")
	@Max(value=100, message = "Description should not be of more than 100 value")
	private String description;
}
