package com.chau.yoyoshop.RestClient;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;

import java.util.List;

public interface SanPhamRest {
    public List<SanPham> getAllSanPHam();
    public SanPham getSanPHam(int theid);
}
