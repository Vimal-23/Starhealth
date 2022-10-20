package com.shoppersden.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "denuser")
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int cartid;
	private String username;
	private String productname;
	private  long productprice;
	private  int quantity;
	private String productimage;
	
	
	public Cart() {
		super();
	}

}
