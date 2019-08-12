package com.luv2code.springdemo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoadon")
public class HoaDon {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAHD")
	private int MAHD;
	
	@Column(name = "NGAYMUA")
	private String NGAYMUA;
	
	@Column(name = "NGAYGIAO")
	private String NGAYGIAO;
	
	@Column(name = "TRANGTHAI")
	private String 	TRANGTHAI;
	
	@Column(name = "TENNGUOINHAN")
	private String TENNGUOINHAN;
	
	@Column(name = "SODT")
	private String SODT;
	
	@Column(name = "DIACHI")
	private String DIACHI;
	
	
	@Column(name = "HINHTHUCTHANHTOAN")
	private String HINHTHUCTHANHTOAN;
	
	@Column(name = "TONGTIEN")
	private double TONGTIEN;
	
	@Column(name = "ANH")
	private String ANH;
	
	@Column(name = "USERID")
	private int USERID;

	public HoaDon() {
	}

	public HoaDon(int mAHD, String nGAYMUA, String nGAYGIAO, String tRANGTHAI, String tENNGUOINHAN, String sODT,
			String dIACHI, String hINHTHUCTHANHTOAN, double tONGTIEN, String aNH, int uSERID) {
		super();
		MAHD = mAHD;
		NGAYMUA = nGAYMUA;
		NGAYGIAO = nGAYGIAO;
		TRANGTHAI = tRANGTHAI;
		TENNGUOINHAN = tENNGUOINHAN;
		SODT = sODT;
		DIACHI = dIACHI;
		HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
		TONGTIEN = tONGTIEN;
		ANH = aNH;
		USERID = uSERID;
	}

	public HoaDon(String tENNGUOINHAN, String sODT, String dIACHI, String hINHTHUCTHANHTOAN, double tONGTIEN) {
		super();
		TENNGUOINHAN = tENNGUOINHAN;
		SODT = sODT;
		DIACHI = dIACHI;
		HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
		TONGTIEN = tONGTIEN;
	}

	public int getMAHD() {
		return MAHD;
	}

	public void setMAHD(int mAHD) {
		MAHD = mAHD;
	}

	public String getNGAYMUA() {
		return NGAYMUA;
	}

	public void setNGAYMUA(String nGAYMUA) {
		NGAYMUA = nGAYMUA;
	}

	public String getNGAYGIAO() {
		return NGAYGIAO;
	}

	public void setNGAYGIAO(String nGAYGIAO) {
		NGAYGIAO = nGAYGIAO;
	}

	public String getTRANGTHAI() {
		return TRANGTHAI;
	}

	public void setTRANGTHAI(String tRANGTHAI) {
		TRANGTHAI = tRANGTHAI;
	}

	public String getTENNGUOINHAN() {
		return TENNGUOINHAN;
	}

	public void setTENNGUOINHAN(String tENNGUOINHAN) {
		TENNGUOINHAN = tENNGUOINHAN;
	}

	public String getSODT() {
		return SODT;
	}

	public void setSODT(String sODT) {
		SODT = sODT;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}

	public String getHINHTHUCTHANHTOAN() {
		return HINHTHUCTHANHTOAN;
	}

	public void setHINHTHUCTHANHTOAN(String hINHTHUCTHANHTOAN) {
		HINHTHUCTHANHTOAN = hINHTHUCTHANHTOAN;
	}

	public double getTONGTIEN() {
		return TONGTIEN;
	}

	public void setTONGTIEN(double tONGTIEN) {
		TONGTIEN = tONGTIEN;
	}

	public String getANH() {
		return ANH;
	}

	public void setANH(String aNH) {
		ANH = aNH;
	}

	public int getUSERID() {
		return USERID;
	}

	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}

	
	


	
	
	
}
