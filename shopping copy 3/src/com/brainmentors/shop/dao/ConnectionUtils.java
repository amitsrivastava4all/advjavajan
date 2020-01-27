package com.brainmentors.shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public interface ConnectionUtils {
	static Connection getConnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb = ResourceBundle.getBundle("db");
		// com.mysql.jdbc.Driver
		//oracle.jdbc.driver.OracleDriver
		Class.forName(rb.getString("drivername"));
		System.out.println("Driver Loaded");
		Connection con = null;
		con = DriverManager.getConnection(rb.getString("dburl"), rb.getString("userid"), rb.getString("password"));
//		if(con!=null) {
//		System.out.println("Connection Create");
//		con.close();
//		}
		return con;
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getConnection();
	}
}
