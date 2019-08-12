package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.luv2code.springdemo.service.SanPhamService;
import java.util.List;


import com.luv2code.springdemo.entity.SanPham;

@RestController
@RequestMapping("/api")
public class SanPhamRestController {

	@Autowired
	private SanPhamService sanPhamService;
	
	
	@GetMapping("/sanpham")
	public List<SanPham> getlistSanPham(){
		return sanPhamService.getListSanPham();
	}
	
	@GetMapping("/loaisanpham/{id}")
	public List<SanPham> getlistLoaiSanPham(@PathVariable(value="id") int theid){
		return sanPhamService.getListLoaiSanPham(theid);
	}
	
	
	
}
