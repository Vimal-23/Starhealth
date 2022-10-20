package com.shoppersden.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppersden.api.entity.Cart;
import com.shoppersden.api.entity.Users;
import com.shoppersden.api.service.CartService;
import com.shoppersden.api.service.ShoppersService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

	@Autowired
	CartService service;
	
	@GetMapping(value = "/displaycart/{name}")
	 @ResponseBody
	 public List<Cart> getProducyByUsername(@PathVariable String name) {
		List<Cart> value = service.getProducyByUsername(name);
		 return value;
	 }
	
	@PostMapping(value = "/addproducts")
	 @ResponseBody
	 public int saveProcucts(@RequestBody Cart cart ) {
		 int value = service.saveProcucts(cart);
		 return value;
	 }
}
