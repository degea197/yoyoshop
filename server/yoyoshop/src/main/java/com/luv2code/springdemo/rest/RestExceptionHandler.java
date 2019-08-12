/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author chauc
 */
@ControllerAdvice
public class RestExceptionHandler {
    
    // add an exception handler for CustomerNotfoundException
    
    @ExceptionHandler
    public ResponseEntity<ErroResponse> handleException(
            NotFoundException customerNotFoundException){
        // create CustomerErrorResponse
        
        ErroResponse error = new ErroResponse(
                HttpStatus.NOT_FOUND.value(),
                customerNotFoundException.getMessage(),
                System.currentTimeMillis());
        
        // return ResponseEntity
        
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    
    
    //add another exception handler ...to catch any exception (catch all)
    
     @ExceptionHandler
    public ResponseEntity<ErroResponse> handleException(
            Exception e){
        // create CustomerErrorResponse
        ErroResponse error = new ErroResponse(
                HttpStatus.BAD_REQUEST.value(),
                e.getMessage(),
                System.currentTimeMillis());
        
        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    
    
    
}
