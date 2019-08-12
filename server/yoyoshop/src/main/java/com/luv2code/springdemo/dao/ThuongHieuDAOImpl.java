package com.luv2code.springdemo.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.ThuongHieu;

@Repository
public  class ThuongHieuDAOImpl implements ThuongHieuDAO{

	@Autowired
	private SessionFactory sessionF;
	
	@Override
	public List<ThuongHieu> getAllThuongHieu() {
		Session currentSession = sessionF.getCurrentSession();
		
		org.hibernate.query.Query<ThuongHieu> theQUery = currentSession.createQuery("from ThuongHieu",ThuongHieu.class);
		List<ThuongHieu> listThuongHieu = theQUery.getResultList();
		return listThuongHieu;
	}

	@Override
	public ThuongHieu getThuongHieu(int theid) {
		Session currentSession = sessionF.getCurrentSession();
		ThuongHieu thuonghieu = currentSession.get(ThuongHieu.class, theid);
		return thuonghieu;
	}

}
