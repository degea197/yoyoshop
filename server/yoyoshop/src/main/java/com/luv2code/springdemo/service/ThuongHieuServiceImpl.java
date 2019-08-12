package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.ThuongHieuDAO;
import com.luv2code.springdemo.entity.ThuongHieu;

@Service
public class ThuongHieuServiceImpl implements ThuongHieuService {

	@Autowired
	private ThuongHieuDAO thuongHieuDAO;
	
	
	
	@Override
	@Transactional
	public List<ThuongHieu> getAllThuongHieu() {
		return thuongHieuDAO.getAllThuongHieu();
	}

	@Override
	@Transactional
	public ThuongHieu getThuongHieu(int theid) {
		return thuongHieuDAO.getThuongHieu(theid);
	}

}
