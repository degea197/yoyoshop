package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.ThuongHieu;

public interface ThuongHieuDAO {
	public List<ThuongHieu> getAllThuongHieu();
	
	public ThuongHieu getThuongHieu(int theid);
}
