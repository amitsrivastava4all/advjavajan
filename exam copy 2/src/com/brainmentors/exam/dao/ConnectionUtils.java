package com.brainmentors.exam.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

public interface ConnectionUtils {
	Logger logger = Logger.getLogger(ConnectionUtils.class);
	public static Connection getConnection() throws NamingException, SQLException {
		logger.debug("Inside Connection Creation");
		String jndiName = "java:/comp/env/jdbc/examjndi";
		Context context = new InitialContext();
		DataSource dataSource = (DataSource)context.lookup(jndiName);
		Connection connection = dataSource.getConnection();
		logger.debug(" Connection Created "+connection);
		return connection;
	}

}
