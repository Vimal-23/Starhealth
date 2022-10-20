package com.shoppersden.api.dao;

import java.util.List;

import com.shoppersden.api.entity.Cart;

public interface CartDao {

	int saveProcucts(Cart cart);

	List<Cart> getProducyByUsername(String name);

}
