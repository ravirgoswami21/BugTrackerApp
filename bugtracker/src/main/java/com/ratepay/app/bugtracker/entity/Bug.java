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
	@Min(value=3, message = "RaisedBy can not be null")
	@Max(value=9, message = "RaisedBy can not be null")
	private String raisedBy;
	
	@OneToOne
	private Project project;
	private Environment environment;
	private DefectType type;
	
	@NotNull(message = "RaisedBy can not be null")
	
	private String description;
	
	@OneToMany
	private List<Comment> comments;
	private DefectStatus status;
	private Priority priority;
	
	@OneToOne
	private ApplUsers applUsers;
	
}
