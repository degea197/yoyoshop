package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.ThuongHieu;

public interface ThuongHieuService {
	public List<ThuongHieu> getAllThuongHieu();
	
	public ThuongHieu getThuongHieu(int theid);
}
