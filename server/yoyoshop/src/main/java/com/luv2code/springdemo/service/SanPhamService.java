package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.SanPham;
import java.util.List;

public interface SanPhamService {
	
	public List<SanPham> getListSanPham();

    public void saveSanPham(SanPham sanPham);

    public SanPham getSanPham(int theId);

    public void deleteSanPham(int theId);
    
    public List<SanPham> getListLoaiSanPham(int theid);

}
