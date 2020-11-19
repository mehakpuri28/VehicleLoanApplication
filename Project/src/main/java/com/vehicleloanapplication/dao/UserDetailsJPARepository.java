package com.vehicleloanapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vehicleloanapplication.model.UserDetailsEntity;
import com.vehicleloanapplication.model.UserRegistrationEntity;



@RepositoryRestResource(collectionResourceRel="userDetails",path="userDetails")
public interface UserDetailsJPARepository extends JpaRepository<UserDetailsEntity,Integer> {
    
	//public UserDetailsEntity findByEmail(@Param("email") String email);
}
