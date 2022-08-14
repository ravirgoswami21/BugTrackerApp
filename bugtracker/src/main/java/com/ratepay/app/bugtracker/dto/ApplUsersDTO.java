package com.ratepay.app.bugtracker.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ratepay.app.bugtracker.util.Enums.UserType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplUsersDTO {
	@Id
	private long id;
	
	@NotNull(message = "FirstName can not be null")
	@Size(max=10,min=5,message="criteria not met")
	private String firstName;
	
//	@NotNull(message = "LastName can not be null")
//	@Min(value=3, message = "LastName should be of minimum 3 value")
	private String lastName;
	
	
//	@NotNull(message = "UserName can not be null")
//	@Min(value=3, message = "UserName should be of minimum 3 value")
	private String userName;
	
	private long mobile;
	
	//@Email(regexp="*@*.*",message = "Email is not Valid")
	private String email;
	
	
//	@NotNull(message = "Password can not be null")
	private String password;
	
	private UserType userType;
	

}
