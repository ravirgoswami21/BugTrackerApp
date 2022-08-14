package com.ratepay.app.bugtracker.entity;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {
	
	private String createdby;
	
	//@JsonFormat(shape=JsonFormatTypes.STRING, pattern="dd-MM-yyyy")
	private Date createdDate;
	
	@NotNull(message = "UpdatedBy can not be null")
	@Min(value=3, message = "UpdatedBy should be of minimum 3 value")
	@Max(value=9, message = "UpdatedBy should not be of more than 9 value")
	private String updatedBy;
	
	//@JsonFormat(shape=JsonFormatTypes.STRING, pattern="dd-MM-yyyy")
	private Date updatedDate;

}
