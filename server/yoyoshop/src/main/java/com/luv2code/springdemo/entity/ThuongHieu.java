package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thuonghieu")
public class ThuongHieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MATHUONGHIEU")
	int MATHUONGHIEU;

	@Column(name = "LUOTMUA")
	int LUOTMUA;

	@Column(name = "TENTHUONGHIEU")
	String TENTHUONGHIEU;

	@Column(name = "HINHTHUONGHIEU")
	String HINHTHUONGHIEU;

	public int getMATHUONGHIEU() {
		return MATHUONGHIEU;
	}

	public void setMATHUONGHIEU(int MATHUONGHIEU) {
		this.MATHUONGHIEU = MATHUONGHIEU;
	}

	public int getLUOTMUA() {
		return LUOTMUA;
	}

	public void setLUOTMUA(int LUOTMUA) {
		this.LUOTMUA = LUOTMUA;
	}

	public String getTENTHUONGHIEU() {
		return TENTHUONGHIEU;
	}

	public void setTENTHUONGHIEU(String TENTHUONGHIEU) {
		this.TENTHUONGHIEU = TENTHUONGHIEU;
	}

	public String getHINHTHUONGHIEU() {
		return HINHTHUONGHIEU;
	}

	public void setHINHTHUONGHIEU(String HINHTHUONGHIEU) {
		this.HINHTHUONGHIEU = HINHTHUONGHIEU;
	}

}
