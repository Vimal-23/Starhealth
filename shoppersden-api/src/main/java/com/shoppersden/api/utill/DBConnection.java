package com.shoppersden.api.utill;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public static Connection getDBConnection() {
	Connection conn = null;

	try {

//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppersden", "root", "6379@@Vim");
//		
		 FileReader reader = new FileReader("src/main/resources/application.properties");
	     Properties prop = new Properties();
	     prop.load(reader);
	     String driverClass = prop.getProperty("driverClass");
	     String url = prop.getProperty("url");
	     String username = prop.getProperty("username");
	     String password = prop.getProperty("password");
	     Class.forName(driverClass);
	     conn = DriverManager.getConnection(url, username, password);

	} catch (ClassNotFoundException e1) {
		e1.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	return conn;
	}
}


