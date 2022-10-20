package com.shoppersden.api.service;

import java.util.List;

import com.shoppersden.api.entity.Cart;

public interface CartService {

	int saveProcucts(Cart cart);

	List<Cart> getProducyByUsername(String name);

}
