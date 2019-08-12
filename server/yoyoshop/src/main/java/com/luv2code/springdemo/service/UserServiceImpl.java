/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.service;


import com.luv2code.springdemo.dao.UserDAO;
import com.luv2code.springdemo.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author chauc
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    
    @Override
    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void saveUser(User theUser) {
            userDAO.saveUser(theUser);
    }

    @Override
    @Transactional
    public User getUser(int theId) {
        return userDAO.getUser(theId);
    }

    @Override
    @Transactional
    public void deleteUser(int theId) {
        userDAO.deleteUser(theId);
    }
    
    @Override
    @Transactional
    public boolean checklogin(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
