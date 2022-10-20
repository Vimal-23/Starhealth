package com.shoppersden.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.shoppersden.api.entity.Users;
import com.shoppersden.api.utill.DBConnection;

@Service
public class ShoppersDenRegisterDaoImpl implements ShoppersDenRegisterDao {
	
	Connection conn = DBConnection.getDBConnection();

	@Override
	public Users findbyusernamandrole(String name, String role) {
		Users usr = new Users();

		try {
			
			String selectByIdQuery = "select username from denuser where username = ? and role = ?";
			PreparedStatement pstmt = conn.prepareStatement(selectByIdQuery);

			pstmt.setString(1, name);
			pstmt.setString(2, role);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				usr.setUsername(rs.getString("username"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usr;
	}

	@Override
	public int addUsers(Users user) { 
		int count = 0;
	try {
		String insertQuery = "insert into denuser (userid,username,password,email,role,mobilenumber,address) values(?,?,?,?,?,?,? )";
		PreparedStatement pstmt = conn.prepareStatement(insertQuery);

		pstmt.setInt(1, user.getUserid());
		pstmt.setString(2, user.getUsername());
		pstmt.setString(3, user.getPassword());
		pstmt.setString(4, user.getEmail());
		pstmt.setString(5, user.getRole());
		pstmt.setLong(6, user.getMobilenumber());
		pstmt.setString(7, user.getAddress());
		count = pstmt.executeUpdate();

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return count;
	}

}
