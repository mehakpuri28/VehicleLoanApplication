package com.vehicleloanapplication.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.vehicleloanapplication.model.UserRegistrationEntity;



@RepositoryRestResource(collectionResourceRel="users",path="users")
public interface UserRegisterJPARepository extends JpaRepository<UserRegistrationEntity,String> {

}


	
