package com.shoppersden.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppersden.api.dao.ShoppersDenRegisterDao;
import com.shoppersden.api.entity.Users;
import com.shoppersden.api.repo.ShoppersRepo;

@Service
public class ShoppersServiceImpl implements ShoppersService {

	@Autowired
	ShoppersRepo repo;
	
	@Autowired
	ShoppersDenRegisterDao dao;
	
	
	@Override
	public List<Users> findAll() {
		return repo.findall();
	}

	@Override
	public Users findbyusernamandrole(String name, String role) {
		return dao.findbyusernamandrole(name,role);
	}

	@Override
	public int addUser(Users user) {
		return dao.addUsers(user);
	}

}
