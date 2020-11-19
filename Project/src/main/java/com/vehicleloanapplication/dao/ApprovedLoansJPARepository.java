package com.vehicleloanapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vehicleloanapplication.model.ApprovedLoansEntity;


@RepositoryRestResource(collectionResourceRel="approvedLoans",path="approvedLoans")
public interface ApprovedLoansJPARepository extends JpaRepository<ApprovedLoansEntity,Integer> {

	
}
