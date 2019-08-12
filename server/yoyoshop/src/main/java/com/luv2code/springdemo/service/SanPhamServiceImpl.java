package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.SanPhamDAO;
import com.luv2code.springdemo.entity.SanPham;

@Service
public class SanPhamServiceImpl implements SanPhamService {

	
	@Autowired
	private SanPhamDAO sanphamDAO;
	
	@Override
	@Transactional
	public List<SanPham> getListSanPham() {
		return sanphamDAO.getListSanPham();
	}

	@Override
	public void saveSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SanPham getSanPham(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSanPham(int theId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<SanPham> getListLoaiSanPham(int theid) {
		return sanphamDAO.getListLoaiSanPham(theid);
	}

}
