package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.HoaDon;
import com.luv2code.springdemo.entity.SanPham;
import com.luv2code.springdemo.service.HoaDonService;

@Controller
@RequestMapping("/ql")
public class HoaDonController {
	
	@Autowired
	private HoaDonService hoaDonService;
	
	@RequestMapping("/donhang")
	public String getallSanpham(Model themodel) {
		List<HoaDon> listHoaDon = hoaDonService.getListHoaDon();
		themodel.addAttribute("listHoaDon",listHoaDon);
		return "ql-hoadon";
	}
	
}
