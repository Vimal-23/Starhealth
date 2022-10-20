package com.shoppersden.api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppersden.api.entity.Products;
import com.shoppersden.api.utill.DBConnection;

@Service
public class ProductDaoImpl implements ProductsDao {

	Connection conn = DBConnection.getDBConnection();

	@Override
	public int addProduct(Products product) {
		int count = 0;
		try {
			String insertQuery = "insert into denproduct(productid,productname,productprice,quantity,productimage) values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, product.getProductid());
			pstmt.setString(2, product.getProductname());
			pstmt.setDouble(3, product.getProductprice());
			pstmt.setLong(4, product.getQuantity());
			pstmt.setString(5, product.getProductimage());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public int updateProduct(Products product) {
		int count = 0;
		try {
			String updateQuery = "update denproduct set productname=? ,productprice=? ,quantity= ?, productimage=? where productid=? ";
			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, product.getProductname());
			pstmt.setDouble(2, product.getProductprice());
			pstmt.setLong(3, product.getQuantity());
			pstmt.setString(4, product.getProductimage());
			pstmt.setInt(5, product.getProductid());
			
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
		
	}

	@Override
	public String deleteProduct(int productid) {
		String deleteQuery = "delete from denproduct where productid = ?";

		PreparedStatement pstmt;
		int deleteCount = 0;
		try {
			pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, productid);

			deleteCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Record deleted sucessfully";
	}

	@Override
	public Products getproduct(int productid) {
		Products prd = new Products();

		try {
			
			String selectByIdQuery = "select * from denproduct where productid = ?";
			PreparedStatement pstmt = conn.prepareStatement(selectByIdQuery);

			pstmt.setInt(1, productid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				prd.setProductid(rs.getInt("productid"));
				prd.setProductname(rs.getString("productname"));
				prd.setProductprice(rs.getLong("productprice"));
				prd.setQuantity(rs.getInt("quantity"));
				prd.setProductimage(rs.getString("productimage"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prd;
	}

	@Override
	public List<Products> getAllproduct() {
		List<Products> prdlist = new ArrayList<Products>();

		try {
			
			String selectQuery = "select * from denproduct";
			PreparedStatement pstmt = conn.prepareStatement(selectQuery);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Products prd = new Products();
				prd.setProductid(rs.getInt("productid"));
				prd.setProductname(rs.getString("productname"));
				prd.setProductprice(rs.getLong("productprice"));
				prd.setQuantity(rs.getInt("quantity"));
				prd.setProductimage(rs.getString("productimage"));
				prdlist.add(prd);
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prdlist;
	}
	
}
