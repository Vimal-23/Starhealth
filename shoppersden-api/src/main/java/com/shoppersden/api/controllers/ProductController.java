package com.shoppersden.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppersden.api.entity.Products;
import com.shoppersden.api.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping(value = "/add")	 
	 public int addProduct(@RequestBody Products product) {
	        return service.addProduct(product);
	 }
	
	@PutMapping(value = "/update")	 
	 public int updateProduct(@RequestBody Products product) {
	        return service.updateProduct(product);
	 }
	
	@DeleteMapping(value = "/delete/{productid}")	 
	 public String deleteProduct(@PathVariable int productid) {
	        return service.deleteProduct(productid);
	 }
	
	@GetMapping(value = "/getproductbyid/{productid}")	 
	 public Products getproduct(@PathVariable int productid) {
	        return service.getproduct(productid);
	 }
	
	@GetMapping(value = "/getallproduct")	 
	 public List<Products> getAllproduct() {
	        return service.getAllproduct();
	 }
	
	

	
}
