/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.User;
import com.luv2code.springdemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author chauc
 */
@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable(value="userId") int userID){
        User theUser = userService.getUser(userID);
        if(theUser==null){
            throw  new NotFoundException("user id not found "+ userID);
        }
        
    	return theUser;
    }
    
    @PostMapping("/users")
    public User addUser(@RequestBody User theUser){
        theUser.setId(0);
        userService.saveUser(theUser);  
        return theUser;
    }
    
    @PostMapping("/xulidangnhap")
    public User xulidangnhap(@RequestBody User theUser){
//        theUser.setId(0);
//        userService.saveUser(theUser);  
        return theUser;
    }
    
    @PutMapping("/users")
    public User updateUser(@RequestBody User theUser){
        userService.saveUser(theUser);
        return theUser;
    }
    
     @DeleteMapping("/customers/{userId}")
    public String deleteCustomer(@PathVariable(value="userId") int userID){
    	User theUser = userService.getUser(userID);
        
        if(theUser==null){
            throw  new NotFoundException("customer id not found "+ userID);
        }
        userService.deleteUser(userID);
        
    	return "deleted customer id: "+userID;
    }
    
}
