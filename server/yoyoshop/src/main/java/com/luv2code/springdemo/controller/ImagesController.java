package com.luv2code.springdemo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.IOException;

import javax.ws.rs.core.HttpHeaders;

import org.apache.commons.io.FileUtils;

@Controller
@RequestMapping("/api")
public class ImagesController {
	
	@RequestMapping("/image/hinhthuonghieu/{productId}")
	@ResponseBody
	public HttpEntity<byte[]> gethinhthuonghieu(@PathVariable String productId) throws IOException {
		byte[] image;
//		D:/kali/server/yoyoshop/src/main/webapp/resources/images
//		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("/PTIT/yoyoshop/yoyoshop/src/main/webapp/resources/images/hinhthuonghieu"+File.separator + productId + ".png"));
		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("D:/kali/server/yoyoshop/src/main/webapp/resources/images/hinhthuonghieu"+File.separator + productId + ".png"));
		
	    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
	    headers.setContentType(org.springframework.http.MediaType.IMAGE_PNG);
	    headers.setContentLength(image.length);
	    return new HttpEntity<byte[]>(image, headers);
	}
	
	@RequestMapping("/image/hinhsanpham/{productId}")
	@ResponseBody
	public HttpEntity<byte[]> gethinhsanpham(@PathVariable String productId) throws IOException {
		byte[] image;
//		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("/PTIT/yoyoshop/yoyoshop/src/main/webapp/resources/images/hinhsanpham"+File.separator + productId + ".png"));
		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("D:/kali/server/yoyoshop/src/main/webapp/resources/images/hinhsanpham"+File.separator + productId + ".png"));
		
	    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
	    headers.setContentType(org.springframework.http.MediaType.IMAGE_PNG);
	    headers.setContentLength(image.length);
	    return new HttpEntity<byte[]>(image, headers);
	}
	
	@RequestMapping("/image/hinhkhuyenmai/{productId}")
	@ResponseBody
	public HttpEntity<byte[]> gethinhkhuyenmai(@PathVariable String productId) throws IOException {
		byte[] image;
//		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("/PTIT/yoyoshop/yoyoshop/src/main/webapp/resources/images/hinhkhuyenmai"+File.separator + productId + ".png"));
		image = org.apache.commons.io.FileUtils.readFileToByteArray(new File("D:/kali/server/yoyoshop/src/main/webapp/resources/images/hinhkhuyenmai"+File.separator + productId + ".png"));
		
	    org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
	    headers.setContentType(org.springframework.http.MediaType.IMAGE_PNG);
	    headers.setContentLength(image.length);
	    return new HttpEntity<byte[]>(image, headers);
	}


	
}
