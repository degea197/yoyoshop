/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.User;
import java.util.List;

/**
 *
 * @author chauc
 */
public interface UserDAO {

    public List<User> getUsers();

    public void saveUser(User theUser);

    public User getUser(int theId);

    public void deleteUser(int theId);

    public boolean checklogin(User user);
    
}
