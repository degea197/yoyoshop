//package com.luv2code.springdemo.service;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.luv2code.springdemo.dao.LoaiSanPhamDAO;
//import com.luv2code.springdemo.entity.Loaisanpham;
//
//@Service
//public class LoaiSanPhamServiceImpl implements LoaiSanPhamService {
//
//	@Autowired
//	private LoaiSanPhamDAO loaisanphamDAO;
//
//	@Override
//	@Transactional
//	public List<Loaisanpham> getlistLoaiSanpham() {
//		return loaisanphamDAO.getlistLoaiSanpham();
//	}
//
//	@Override
//	@Transactional
//	public Loaisanpham getLoaiSanPham(int theid) {
//		return loaisanphamDAO.getLoaiSanPham(theid);
//	}
//
//}
