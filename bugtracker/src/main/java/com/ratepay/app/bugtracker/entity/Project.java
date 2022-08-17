package com.ratepay.app.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Project")
public class Project extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull(message = "Cade can not be null")
	@Size(max=5,min=3,message="criteria not met")
	private String code;
	
	@NotNull(message = "Name can not be null")
	@Size(max=20,min=3,message="criteria not met")
	private String name;
	
	@NotNull(message = "Description can not be null")
	@Size(max=100,min=5,message="criteria not met")
	private String description;
}
