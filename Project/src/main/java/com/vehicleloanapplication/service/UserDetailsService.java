package com.vehicleloanapplication.service;





import com.vehicleloanapplication.model.UserDetailsEntity;
import java.util.List;
public interface UserDetailsService 
{
    public List<UserDetailsEntity> addUserDetails(UserDetailsEntity useradvanced);//userDao
    public UserDetailsEntity showUserDetailsInformation(Integer user_id);//userDao
    public List<UserDetailsEntity> editUserDetails(UserDetailsEntity user);//userDao
    public List<UserDetailsEntity> showAllUserDetails();//adminDao
    
    
    
}