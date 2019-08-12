package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.SanPham;
import com.luv2code.springdemo.service.SanPhamService;

@Controller
@RequestMapping("/ql")
public class SanPhamController {

	@Autowired
	private SanPhamService sanPhamService;
	
	@RequestMapping("/sanpham")
	public String getallSanpham(Model themodel) {
		List<SanPham> listSanPham = sanPhamService.getListSanPham();
		themodel.addAttribute("listSanPham",listSanPham);
		return "ql-sanpham";
	}
	
}
