package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.HoaDonDAO;
import com.luv2code.springdemo.entity.HoaDon;

@Service
public class HoaDonServiceImpl implements HoaDonService {

	@Autowired
	private HoaDonDAO hoadonDAO;
	
	
	@Override
	@Transactional
	public List<HoaDon> getListHoaDon() {
		return hoadonDAO.getListHoaDon();
	}

}
