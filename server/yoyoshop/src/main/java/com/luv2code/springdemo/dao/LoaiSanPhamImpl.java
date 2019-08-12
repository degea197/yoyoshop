//package com.luv2code.springdemo.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.luv2code.springdemo.entity.Loaisanpham;
//import com.luv2code.springdemo.entity.SanPham;
//import com.luv2code.springdemo.entity.User;
//
//@Repository
//public class LoaiSanPhamImpl implements LoaiSanPhamDAO {
//
//	@Autowired
//	private SessionFactory sessionF;
//
//	@Override
//	public List<Loaisanpham> getlistLoaiSanpham() {
//		Session currentSession = sessionF.getCurrentSession();
//		 Query<Loaisanpham> theQuery
//         = currentSession.createQuery("from Loaisanpham", Loaisanpham.class);
//		 List<Loaisanpham> listLoaisanpham = theQuery.getResultList();
//		return listLoaisanpham;
//	}
//
//	@Override
//	public Loaisanpham getLoaiSanPham(int theid) {
//		Session currentSession = sessionF.getCurrentSession();
//		 Loaisanpham loaisanpham = currentSession.get(Loaisanpham.class, theid);
//		return loaisanpham;
//	}
//
//}
