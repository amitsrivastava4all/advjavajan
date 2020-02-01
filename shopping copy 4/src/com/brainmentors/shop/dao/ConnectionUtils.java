package com.brainmentors.shop.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public interface ConnectionUtils {
	static Connection getConnection() throws ClassNotFoundException, SQLException{
		ResourceBundle rb = ResourceBundle.getBundle("db");
		// com.mysql.jdbc.Driver
		//oracle.jdbc.driver.OracleDriver
		//Class.forName(rb.getString("drivername"));
		Connection con = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup(rb.getString("jndiname"));
			con= ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Driver Loaded");
		
		//con = DriverManager.getConnection(
//				rb.getString("dburl"), 
//				rb.getString("userid"),
//				rb.getString("password"));
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
