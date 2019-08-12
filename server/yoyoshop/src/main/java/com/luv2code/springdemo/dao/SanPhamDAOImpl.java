package com.luv2code.springdemo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.SanPham;

@Repository
public class SanPhamDAOImpl implements SanPhamDAO{

	@Autowired
	private SessionFactory sessionF;
	
	@Override
	public List<SanPham> getListSanPham() {
		  Session currentSession = sessionF.getCurrentSession();
	        Query<SanPham> theQuery
	                = currentSession.createQuery("from SanPham", SanPham.class);
	        List<SanPham> lisSanPham = theQuery.getResultList();
	        return lisSanPham;
	}

	@Override
	public void saveSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SanPham getSanPham(int theId)   {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSanPham(int theId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SanPham> getListLoaiSanPham(int theid) {
		Session currentSession = sessionF.getCurrentSession();
        Query<SanPham> theQuery
                = currentSession.createQuery("from SanPham WHERE MALOAISP= :theid", SanPham.class);
        theQuery.setInteger("theid", theid);
        List<SanPham> lisSanPham = theQuery.getResultList();
        return lisSanPham;
	}

}
