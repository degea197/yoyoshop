package com.luv2code.springdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="sanpham")
public class SanPham {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MASP")
    int MASP;
    
    @Column(name="TENSP")
    String TENSP;
    
    @Column(name="GIA")
    Double GIA;
    
    @Column(name="ANHLON")
    String ANHLON;
    
    @Column(name="ANHNHO")
    String ANHNHO;
    
    @Column(name="THONGTIN")
    String THONGTIN;
    
    @Column(name="SOLUONG")
    Integer SOLUONG;
    
    
    
    @Column(name="MATHUONGHIEU")
    Integer MATHUONGHIEU;
    
    @Column(name="MANV")
    Integer MANV;
    
    @Column(name="LUOTMUA")
    Integer LUOTMUA;
    
    @Column(name="MALOAISP")
    Integer MALOAISP;
    
    
//    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,
//					CascadeType.DETACH,CascadeType.REFRESH})
//    @JoinColumn(name="MALOAISP")
//    private Loaisanpham loaiSanPham;
    
    
    
    
    
    

//	public Loaisanpham getLoaiSanPham() {
//		return loaiSanPham;
//	}
//
//	public void setLoaiSanPham(Loaisanpham loaiSanPham) {
//		this.loaiSanPham = loaiSanPham;
//	}
	
	
	

	

	public Integer getMALOAISP() {
		return MALOAISP;
	}

	public void setMALOAISP(Integer mALOAISP) {
		MALOAISP = mALOAISP;
	}

	public SanPham(String tENSP, Double gIA, String aNHLON, String aNHNHO, String tHONGTIN, int sOLUONG,
			Integer mATHUONGHIEU, Integer mANV, int lUOTMUA) {
		super();
		TENSP = tENSP;
		GIA = gIA;
		ANHLON = aNHLON;
		ANHNHO = aNHNHO;
		THONGTIN = tHONGTIN;
		SOLUONG = sOLUONG;
		MATHUONGHIEU = mATHUONGHIEU;
		MANV = mANV;
		LUOTMUA = lUOTMUA;
	}

	public SanPham() {   
		super();
	}

	public int getMASP() {
		return MASP;
	}

	public void setMASP(int mASP) {
		MASP = mASP;
	}

	public String getTENSP() {
		return TENSP;
	}

	public void setTENSP(String tENSP) {
		TENSP = tENSP;
	}

	public Double getGIA() {
		return GIA;
	}

	public void setGIA(Double gIA) {
		GIA = gIA;
	}

	public String getANHLON() {
		return ANHLON;
	}

	public void setANHLON(String aNHLON) {
		ANHLON = aNHLON;
	}

	public String getANHNHO() {
		return ANHNHO;
	}

	public void setANHNHO(String aNHNHO) {
		ANHNHO = aNHNHO;
	}

	public String getTHONGTIN() {
		return THONGTIN;
	}

	public void setTHONGTIN(String tHONGTIN) {
		THONGTIN = tHONGTIN;
	}

	public int getSOLUONG() {
		return SOLUONG;
	}

	public void setSOLUONG(int sOLUONG) {
		SOLUONG = sOLUONG;
	}

//	public int getMALOAISP() {
//		return MALOAISP;
//	}
//
//	public void setMALOAISP(int mALOAISP) {
//		MALOAISP = mALOAISP;
//	}

	public Integer getMATHUONGHIEU() {
		return MATHUONGHIEU;
	}

	public void setMATHUONGHIEU(Integer mATHUONGHIEU) {
		MATHUONGHIEU = mATHUONGHIEU;
	}

	public Integer getMANV() {
		return MANV;
	}

	public void setMANV(Integer mANV) {
		MANV = mANV;
	}

	public int getLUOTMUA() {
		return LUOTMUA;
	}

	public void setLUOTMUA(int lUOTMUA) {
		LUOTMUA = lUOTMUA;
	}

    
    
    
//
//    int SOLUONGTONKHO;
//
//    String TENNHANVIEN;
//    List<ChiTietSanPham> chiTietSanPhamList;
//    ChiTietKhuyenMai chiTietKhuyenMai;
//
//
//
//    
//
//
////    public byte[] getHinhgiohang() {
////        return hinhgiohang;
////    }
////
////    public void setHinhgiohang(byte[] hinhgiohang) {
////        this.hinhgiohang = hinhgiohang;
////    }
////
////    byte[] hinhgiohang;
//
//    public String getTENNHANVIEN() {
//        return TENNHANVIEN;
//    }
//
//    public void setTENNHANVIEN(String TENNHANVIEN) {
//        this.TENNHANVIEN = TENNHANVIEN;
//    }
//
//
//
////    public List<ChiTietSanPham> getChiTietSanPhamList() {
////        return chiTietSanPhamList;
////    }
////
////    public void setChiTietSanPhamList(List<ChiTietSanPham> chiTietSanPhamList) {
////        this.chiTietSanPhamList = chiTietSanPhamList;
////    }
//
//
//
//    public String getTENSP() {
//        return TENSP;
//    }
//
//    public void setTENSP(String TENSP) {
//        this.TENSP = TENSP;
//    }
//
//
//
//    public String getTHONGTIN() {
//        return THONGTIN;
//    }
//
//    public void setTHONGTIN(String THONGTIN) {
//        this.THONGTIN = THONGTIN;
//    }
//
//    public int getMASP() {
//        return MASP;
//    }
//
//    public void setMASP(int MASP) {
//        this.MASP = MASP;
//    }
//
//    public Double getGIA() {
//        return GIA;
//    }
//
//    public void setGIA(Double GIA) {
//        this.GIA = GIA;
//    }
//
//    public int getSOLUONG() {
//        return SOLUONG;
//    }
//
//    public void setSOLUONG(int SOLUONG) {
//        this.SOLUONG = SOLUONG;
//    }
//
//    public int getMALOAISP() {
//        return MALOAISP;
//    }
//
//    public void setMALOAISP(int MALOAISP) {
//        this.MALOAISP = MALOAISP;
//    }
//
//    public Integer getMATHUONGHIEU() {
//        return MATHUONGHIEU;
//    }
//
//    public void setMATHUONGHIEU(Integer MATHUONGHIEU) {
//        this.MATHUONGHIEU = MATHUONGHIEU;
//    }
//
//    public Integer getMANV() {
//        return MANV;
//    }
//
//    public void setMANV(Integer MANV) {
//        this.MANV = MANV;
//    }
//
//    public int getLUOTMUA() {
//        return LUOTMUA;
//    }
//
//    public void setLUOTMUA(int LUOTMUA) {
//        this.LUOTMUA = LUOTMUA;
//    }
//
//    public String getANHLON() {
//        return ANHLON;
//    }
//
//    public void setANHLON(String ANHLON) {
//        this.ANHLON = ANHLON;
//    }
//
//    public String getANHNHO() {
//        return ANHNHO;
//    }
//
//    public void setANHNHO(String ANHNHO) {
//        this.ANHNHO = ANHNHO;
//    }


}
