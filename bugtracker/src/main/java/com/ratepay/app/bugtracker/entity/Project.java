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
	@Min(value=3, message = "Cade can not be null")
	@Max(value=5, message = "Cade can not be null")
	private String code;
	
	@NotNull(message = "Name can not be null")
	@Min(value=3, message = "Name can not be null")
	@Max(value=9, message = "Name can not be null")
	private String name;
	
	@NotNull(message = "Description can not be null")
	@Min(value=4, message = "Description can not be null")
	@Max(value=10, message = "Description can not be null")
	private String description;
}
