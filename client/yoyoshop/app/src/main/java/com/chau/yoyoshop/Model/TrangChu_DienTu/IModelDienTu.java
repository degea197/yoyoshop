package com.chau.yoyoshop.Model.TrangChu_DienTu;

import com.chau.yoyoshop.Model.ObjectClass.SanPham;
import com.chau.yoyoshop.Model.ObjectClass.ThuongHieu;

import java.util.List;

public interface IModelDienTu {
    public List<SanPham> LayDanhSachSanPhamTOP();
    public List<ThuongHieu> LayDanhSachThuongHieuLon();
}
