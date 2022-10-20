package com.shoppersden.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppersden.api.entity.Cart;
import com.shoppersden.api.utill.DBConnection;

@Service
public class CartDaoImpl implements CartDao {

	Connection conn = DBConnection.getDBConnection();

	@Override
	public int saveProcucts(Cart cart) {
		int count = 0;
		try {
			String insertQuery = "insert into cart(cartid,productname,productprice,quantity,productimage,username) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setLong(1, cart.getCartid());
			pstmt.setString(2, cart.getProductname());
			pstmt.setDouble(3, cart.getProductprice());
			pstmt.setLong(4, cart.getQuantity());
			pstmt.setString(5, cart.getProductimage());
			pstmt.setString(6, cart.getUsername());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public List<Cart> getProducyByUsername(String name) {
		
		List<Cart> cartlist =new ArrayList<Cart>();
		try {
			
			String selectByIdQuery = "select * from cart where username = ?";
			PreparedStatement pstmt = conn.prepareStatement(selectByIdQuery);
	
			pstmt.setString(1, name);
	
			ResultSet rs = pstmt.executeQuery();
	
			while (rs.next()) {
				Cart cart =new Cart();
				cart.setCartid(rs.getInt("cartid"));
				cart.setProductname(rs.getString("productname"));
				cart.setProductprice(rs.getLong("productprice"));
				cart.setQuantity(rs.getInt("quantity"));
				cart.setProductimage(rs.getString("productimage"));
				cart.setUsername(rs.getString("username"));	
				cartlist.add(cart);
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cartlist;
	}

}
