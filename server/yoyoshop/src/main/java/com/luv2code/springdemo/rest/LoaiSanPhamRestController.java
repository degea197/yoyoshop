//package com.luv2code.springdemo.rest;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.luv2code.springdemo.entity.Loaisanpham;
//import com.luv2code.springdemo.service.LoaiSanPhamService;
//
//@RestController
//@RequestMapping("/api")
//public class LoaiSanPhamRestController {
//	
//	@Autowired
//	private LoaiSanPhamService loaiSanPhamService;
//	
//	@GetMapping("/loaisanpham")
//	public List<Loaisanpham> getlistLoaiSanPham(){
//		return loaiSanPhamService.getlistLoaiSanpham();
//	}
//	
//}
