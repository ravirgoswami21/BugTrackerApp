package com.ratepay.app.bugtracker.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.ratepay.app.bugtracker.util.Enums.DefectStatus;
import com.ratepay.app.bugtracker.util.Enums.DefectType;
import com.ratepay.app.bugtracker.util.Enums.Environment;
import com.ratepay.app.bugtracker.util.Enums.Priority;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bug")
public class Bug extends BaseEntity{

	
	@Id
	private long Id;
	
	@NotNull(message = "RaisedBy can not be null")
	@Min(value=2, message = "RaisedBy should be of minimum 2 value")
	private String raisedBy;
	
	@OneToOne
	private Project project;
	private Environment environment;
	private DefectType type;
	
	@NotNull(message = "Description can not be null")
	@Min(value=8, message = "Description should be of minimum 8 value")
	@Max(value=50, message = "Description should not be of more than 50 value")
	private String description;
	
	@OneToMany
	private List<Comment> comments;
	private DefectStatus status;
	private Priority priority;
	
	@OneToOne
	private ApplUsers applUsers;
	
}
