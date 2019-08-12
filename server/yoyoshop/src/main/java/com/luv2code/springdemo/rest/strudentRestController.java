/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luv2code.springdemo.service.CustomerService;
import com.luv2code.springdemo.entity.Customer;

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
public class strudentRestController {
    
    @Autowired
    private CustomerService customerService; 
    
    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    
    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable(value="customerId") int customerID){
    	Customer theCustomer = customerService.getCustomer(customerID);
        
        if(theCustomer==null){
            throw  new NotFoundException("customer id not found "+ customerID);
        }
        
    	return theCustomer;
    }
    
    // add mapping for post / customers
    
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){
        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }
    
    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }
    
     @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable(value="customerId") int customerID){
    	Customer theCustomer = customerService.getCustomer(customerID);
        
        if(theCustomer==null){
            throw  new NotFoundException("customer id not found "+ customerID);
        }
        customerService.deleteCustomer(customerID);
        
    	return "deleted customer id: "+customerID;
    }
    
    
    
}
