package com.vehicleloanapplication.service;
 

import com.vehicleloanapplication.dto.AdminDto;
import com.vehicleloanapplication.model.AdminEntity;
 
import antlr.collections.List;
 
public interface AdminService{
 
    public AdminEntity adminRegister(AdminEntity admin);
    public AdminEntity showAdminDetailsByEmail(String email); 
   
} 
   
    
