package com.vehicleloanapplication.controller;

import java.util.List;

 

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 


import com.vehicleloanapplication.model.UserDetailsEntity;
import com.vehicleloanapplication.service.UserDetailsService;

 

@RestController
@RequestMapping("/api/v1")
public class UserDetailsController {

 

    @Autowired
    private UserDetailsService Service;
    
   
    @PostMapping("/addUsers")
    public ResponseEntity<List<UserDetailsEntity>> insertProduct(
            @RequestBody UserDetailsEntity user){
       List<UserDetailsEntity> users=Service.addUserDetails(user);
       if(users.isEmpty())
        {
            return new ResponseEntity("Sorry! Users not available!",
                    HttpStatus.NOT_FOUND);
        }
       
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
    
    @PutMapping("/editUsers")
    public ResponseEntity<List<UserDetailsEntity>> updateProduct(
            @RequestBody UserDetailsEntity user){
        List<UserDetailsEntity> users= Service.editUserDetails(user);
        if(users.isEmpty())
        {
            return new ResponseEntity("Sorry! Users not available!",
                    HttpStatus.NOT_FOUND);
        }
       
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
    @GetMapping("/UserDetailsEntity/{user_id}")
    public ResponseEntity<UserDetailsEntity> findProduct(
            @PathVariable("user_id")Integer user_id){
        UserDetailsEntity user= Service.showUserDetailsInformation(user_id);
        if(user==null) {
            return new ResponseEntity("Sorry! Products not found!", 
                    HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<UserDetailsEntity>(user, HttpStatus.OK);
    }

 

    @GetMapping("/showAllUsers")
    public ResponseEntity<List<UserDetailsEntity>> getAllProducts(){
        List<UserDetailsEntity> users= Service.showAllUserDetails();
        if(users.isEmpty()) {
            return new ResponseEntity("Sorry! Users not available!",
                    HttpStatus.NOT_FOUND);
        }
       
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
    
    }
 