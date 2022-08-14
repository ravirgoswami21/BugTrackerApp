package com.ratepay.app.bugtracker.mapper;

import com.ratepay.app.bugtracker.dto.ApplUsersDTO;
import com.ratepay.app.bugtracker.entity.ApplUsers;

public class MApperServiceIImpl{

	
	public ApplUsers ApplUSerDTOtoApplUsers(ApplUsersDTO applUsersDTO) {
		if ( applUsersDTO == null ) {
            return null;
        }
		ApplUsers simpleDestination = new ApplUsers();
        simpleDestination.setFirstName( applUsersDTO.getFirstName() );
        return simpleDestination;
	}

	
	public ApplUsersDTO ApplUserstoApplUSerDTO(ApplUsers applUsersDTO) {
		 if ( applUsersDTO == null ) {
	            return null;
	        }
		 ApplUsersDTO simpleSource = new ApplUsersDTO();
	        simpleSource.setFirstName( applUsersDTO.getFirstName() );
	        return simpleSource;
	}

}
