package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.HoaDon;
import com.luv2code.springdemo.service.HoaDonService;

@RestController
@RequestMapping("/api")
public class HoaDonRestContrller {
	
	@Autowired
	private HoaDonService hoaDonService;
	
	@GetMapping("/hoadon")
    public List<HoaDon> getUsers(){
		System.out.println("dcmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        return hoaDonService.getListHoaDon();
    }
	
}
