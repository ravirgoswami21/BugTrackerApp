package com.ratepay.app.bugtracker.entity;

import java.sql.Date;

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
	private String updatedBy;
	//@JsonFormat(shape=JsonFormatTypes.STRING, pattern="dd-MM-yyyy")
	private Date updatedDate;

}
