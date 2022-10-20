package com.shoppersden.api.service;

import java.util.List;

import com.shoppersden.api.entity.Products;

public interface ProductService {

	public int addProduct(Products product);

	public int updateProduct(Products product);

	public String deleteProduct(int productid);

	public Products getproduct(int productid);

	public List<Products> getAllproduct();

}
