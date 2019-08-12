package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.HoaDon;
import com.luv2code.springdemo.entity.User;

@Repository
public class HoaDonDAOImpl implements HoaDonDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<HoaDon> getListHoaDon() {
		System.out.println("lllllllllllllllllllllllllllllllllllllllllll");
		Session currentSession = sessionFactory.getCurrentSession();
        Query<HoaDon> theQuery
                = currentSession.createQuery("from HoaDon", HoaDon.class);
        List<HoaDon> listHoaDon = theQuery.getResultList();
        System.out.println("===============================");
        System.out.println(listHoaDon.size());
        System.out.println("===============================");
		return listHoaDon;
	}

}
