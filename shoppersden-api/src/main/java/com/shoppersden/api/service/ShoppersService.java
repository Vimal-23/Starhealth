package com.shoppersden.api.service;

import java.util.List;

import com.shoppersden.api.entity.Users;


public interface ShoppersService {

	List<Users> findAll();

	Users findbyusernamandrole(String name, String role);

	int addUser(Users user);

}
