package com.ratepay.app.bugtracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.ratepay.app.bugtracker.util.Enums.UserType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "applUsers")
public class ApplUsers extends BaseEntity{

	@Id
	private long id;
	
	@NotNull(message = "FirstName can not be null")
	@Min(value=3, message = "FirstName can not be null")
	@Max(value=9, message = "FirstName can not be null")
	private String firstName;
	
	@NotNull(message = "LastName can not be null")
	@Min(value=3, message = "LastName can not be null")
	@Max(value=9, message = "LastName can not be null")
	private String lastName;
	
	
	@NotNull(message = "UserName can not be null")
	@Min(value=3, message = "UserName can not be null")
	@Max(value=15, message = "UserName can not be null")
	private String userName;
	
	private long mobile;
	
	@Email(regexp="*@*.*",message = "Email can not be null")
	private String email;
	
	
	@NotNull(message = "Password can not be null")
	private String password;
	
	@NotNull(message = "UserType can not be null")
	@Min(value=3, message = "UserType can not be null")
	@Max(value=9, message = "UserType can not be null")
	private UserType userType;
	
}