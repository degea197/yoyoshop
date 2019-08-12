package com.luv2code.springdemo.dao;

import com.luv2code.springdemo.entity.SanPham;
import java.util.List;

public interface SanPhamDAO {
	
	public List<SanPham> getListSanPham();

    public void saveSanPham(SanPham sanPham);

    public SanPham getSanPham(int theId);

    public void deleteSanPham(int theId);
    
    public List<SanPham> getListLoaiSanPham(int theid);

 
}
