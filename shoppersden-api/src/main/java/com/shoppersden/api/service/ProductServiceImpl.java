package com.shoppersden.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppersden.api.dao.ProductsDao;
import com.shoppersden.api.entity.Products;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductsDao productdao;
	
	
	@Override
	public int addProduct(Products product) {
		return productdao.addProduct(product);
	}


	@Override
	public int updateProduct(Products product) {
		return productdao.updateProduct(product);
	}


	@Override
	public String deleteProduct(int productid) {
		return productdao.deleteProduct(productid);
	}


	@Override
	public Products getproduct(int productid) {
		return productdao.getproduct(productid);
	}


	@Override
	public List<Products> getAllproduct() {
		return productdao.getAllproduct();
	}

}
