package com.vehicleloanapplication.service;
 
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicleloanapplication.dao.AdminJPARepository;
import com.vehicleloanapplication.dto.AdminDto;
import com.vehicleloanapplication.model.AdminEntity;
 

@Service
public class AdminServiceImpl implements AdminService{

 
    
    @Autowired
    private AdminJPARepository adminRepo;
 
    @Override
    public AdminEntity adminRegister(AdminEntity admin) {
    
        
        AdminEntity adminEntity = new AdminEntity();
        adminEntity = adminRepo.saveAndFlush(admin); 
        return adminEntity;}
  
    
    
    @Override
    public AdminEntity showAdminDetailsByEmail(String email) {
    
        
        Optional<AdminEntity> admin = adminRepo.findById(email);
        
        if(admin.isPresent()) {
            return admin.get();}
        else
            return null;
        }
     
    
}