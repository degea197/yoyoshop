package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.entity.User;
import com.luv2code.springdemo.service.UserService;

@Controller
@RequestMapping("/ql")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public String getallUser(Model themodel){
		List<User> listUser = userService.getUsers();
		themodel.addAttribute("listuser",listUser);
		return "ql-users";
	}
	
}
