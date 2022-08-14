package com.ratepay.app.bugtracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ratepay.app.bugtracker.dto.ApplUsersDTO;
import com.ratepay.app.bugtracker.entity.ApplUsers;

@Mapper(componentModel = "spring")
public interface MapperService {
	
	//@Mapping(target="firstName", source="applUsersDTO.firstName")
	ApplUsers ApplUSerDTOtoApplUsers(ApplUsersDTO applUsersDTO);
	
	
	ApplUsersDTO ApplUserstoApplUSerDTO(ApplUsers applUsersDTO);

}
