package com.shoppersden.api.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "denuser")
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int userid;
	private String username;
	private String email;
	private  String password;
	private  String role;
	private long mobilenumber;
	private String address;
	
	
		
	public Users() {	
		super();
	}
	
	

}
