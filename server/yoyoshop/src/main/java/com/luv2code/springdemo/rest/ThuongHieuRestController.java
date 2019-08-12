package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.ThuongHieu;
import com.luv2code.springdemo.service.ThuongHieuService;

@RestController
@RequestMapping("/api")
public class ThuongHieuRestController {
	
	@Autowired
	private ThuongHieuService thuongHuongService;

	@GetMapping("/thuonghieu")
	public List<ThuongHieu> getAllThuongHieu(){
		return thuongHuongService.getAllThuongHieu();
	}
	@GetMapping("/thuonghieu/{theId}")
	public ThuongHieu getThuongHieu(@PathVariable(value="theId")int theId) {
		ThuongHieu th = thuongHuongService.getThuongHieu(theId);
		if(th==null) {
			throw  new NotFoundException("thuonghieu id not found "+ theId);
		}
		return th;
	}
	
}
