package com.shoppersden.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppersden.api.dao.CartDao;
import com.shoppersden.api.entity.Cart;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartDao dao;

	@Override
	public int saveProcucts(Cart cart) {
		return dao.saveProcucts(cart);
	}

	@Override
	public List<Cart> getProducyByUsername(String name) {
		return dao.getProducyByUsername(name);
	}

	
}
