package com.ratepay.app.bugtracker.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ratepay.app.bugtracker.util.Enums.UserType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "applUsers")
public class ApplUsers extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull(message = "FirstName can not be null")
	@Size(max=10,min=5,message="criteria not met")
	private String firstName;
	
	@NotNull(message = "LastName can not be null")
	@Size(max=20,min=3,message="criteria not met")
	private String lastName;
	
	
	@NotNull(message = "UserName can not be null")
	@Size(max=50,min=3,message="criteria not met")
	private String userName;
	
	
	//@Pattern(regexp = "(^$|[0-9]{10})")
	private long mobile;
	
	//@Email(regexp="*@*.*",message = "Email is not Valid")
	private String email;
	
	
//	@NotNull(message = "Password can not be null")
	private String password;
	
	private UserType userType;
	
}
