package com.ratepay.app.bugtracker.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ratepay.app.bugtracker.entity.ApplUsers;
import com.ratepay.app.bugtracker.util.Enums.UserType;

@Repository
@Transactional
public interface ApplUserRepository extends JpaRepository<ApplUsers, Long>{
	
	@Modifying
	@Query(value = "update APPL_USERS set password = :password where id = :id",nativeQuery = true)
	int resetPassoword(@Param("id")long id, @Param("password")String password);

	List<ApplUsers> findByUserType(UserType userType);
	
	List<ApplUsers> findByUserName(String userName);
}
