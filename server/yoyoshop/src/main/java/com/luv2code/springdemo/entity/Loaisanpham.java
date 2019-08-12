//package com.luv2code.springdemo.entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "loaisanpham")
//public class Loaisanpham {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "MASP")
//	private int MALOAISP;
//	
//	@Column(name = "MALOAICHA")
//	private int MALOAICHA;
//	
//	@Column(name = "MASP")
//	private String TENLOAISP;
//	
////	@OneToMany(mappedBy="loaiSanPham",
////			cascade= {CascadeType.PERSIST,CascadeType.MERGE,
////					CascadeType.DETACH,CascadeType.REFRESH})
////	private List<SanPham> listSanPham;
////
////	
////	public void add(SanPham pham) {
////		if(listSanPham==null) {
////			listSanPham = new ArrayList<>();
////		}
////		
////		listSanPham.add(pham);
////		pham.setLoaiSanPham(this);
////	}
//	
//	public int getMALOAISP() {
//		return MALOAISP;
//	}
//
//	public void setMALOAISP(int mALOAISP) {
//		MALOAISP = mALOAISP;
//	}
//
//	public int getMALOAICHA() {
//		return MALOAICHA;
//	}
//
//	public void setMALOAICHA(int mALOAICHA) {
//		MALOAICHA = mALOAICHA;
//	}
//
//	public String getTENLOAISP() {
//		return TENLOAISP;
//	}
//
//	public void setTENLOAISP(String tENLOAISP) {
//		TENLOAISP = tENLOAISP;
//	}
//
////	public List<SanPham> getListSanPham() {
////		return listSanPham;
////	}
////
////	public void setListSanPham(List<SanPham> listSanPham) {
////		this.listSanPham = listSanPham;
////	}
////	
//	
//	
//
//}
