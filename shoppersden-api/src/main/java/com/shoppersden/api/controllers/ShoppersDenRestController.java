package com.shoppersden.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppersden.api.entity.Users;
import com.shoppersden.api.repo.ShoppersRepo;
import com.shoppersden.api.service.ShoppersService;

@RestController
@RequestMapping("/api/v1/shoppers")
public class ShoppersDenRestController {
	

	@Autowired
	ShoppersService service;
	
	 @GetMapping(value = "/getallusers")	 
	 public List<Users> getAllUsers() {
	        List<Users> listUsers = service.findAll();
	        return listUsers;
	 }
	 
	 @GetMapping(value = "/login/{name}/{role}")
	 @ResponseBody
	 public Users login(@PathVariable String name, @PathVariable String role ) {
		 Users value = service.findbyusernamandrole(name,role);
		 return value;
	 }
	 
	 @PostMapping(value = "/register")	 
	 public int listAll(@RequestBody Users user) {
	        return service.addUser(user);
	 }

}
