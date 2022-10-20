package com.shoppersden.api.dao;

import com.shoppersden.api.entity.Users;

public interface ShoppersDenRegisterDao {

	Users findbyusernamandrole(String name, String role);

	int addUsers(Users user);
	

}
