package com.vehicleloanapplication.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vehicleloanapplication.dao.UserDetailsJPARepository;
import com.vehicleloanapplication.model.UserDetailsEntity;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
        private UserDetailsJPARepository userDetailsDao;

 

    @Override
    public List<UserDetailsEntity> addUserDetails(UserDetailsEntity useradvanced)
     {
        // TODO Auto-generated method stub
       
        userDetailsDao.saveAndFlush(useradvanced);
        return   userDetailsDao.findAll();
        
    }

 

    @Override
    public List<UserDetailsEntity> editUserDetails(UserDetailsEntity user) {
        // TODO Auto-generated method stub
        userDetailsDao.save(user);
        return  userDetailsDao.findAll();
        
    }

 

    @Override
    public UserDetailsEntity showUserDetailsInformation(Integer user_id) {
        Optional<UserDetailsEntity>user=userDetailsDao.findById(user_id);
        return user.get();
        
    }
    
    @Override
    public List<UserDetailsEntity> showAllUserDetails() {
        // TODO Auto-generated method stub
            return userDetailsDao.findAll();
    }
    }
        
