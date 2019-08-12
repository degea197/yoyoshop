/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springdemo.entity.User;

/**
 *
 * @author chauc
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUsers() {

        Session currentSession = sessionFactory.getCurrentSession();
        Query<User> theQuery
                = currentSession.createQuery("from User", User.class);
        List<User> lisUser = theQuery.getResultList();
        return lisUser;
    }

    @Override
    public void saveUser(User theUser) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theUser);
    }

    @Override
    public User getUser(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        User theUser = currentSession.get(User.class, theId);
        return theUser;
    }

    @Override
    public void deleteUser(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = currentSession.createQuery("delete from user where id=:userID");
	theQuery.setParameter("userID", theId);
	theQuery.executeUpdate();	
    }

    @Override
    public boolean checklogin(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
