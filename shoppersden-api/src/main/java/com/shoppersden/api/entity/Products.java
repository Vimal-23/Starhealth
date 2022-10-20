package com.shoppersden.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
	
	public Products() {
		super();
	}
	private int productid;
	private String productname;
	private long productprice;
	private int quantity;
	private String productimage;
	
}
