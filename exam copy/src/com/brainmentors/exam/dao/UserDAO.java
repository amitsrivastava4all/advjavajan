package com.brainmentors.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.brainmentors.exam.dto.UserDTO;

public class UserDAO {
	Logger logger = Logger.getLogger(UserDAO.class);
	public boolean register(UserDTO userDTO) throws NamingException, SQLException {
		logger.debug("Inside DAO Register");
		Connection con = null;
		PreparedStatement pstmt = null;
		int recordCount = 0;
		try {
		con = ConnectionUtils.getConnection();
		pstmt = con.prepareStatement("insert into user_mst(userid, pwd, email , phone, regcode) values(?,?,?,?,?)");
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPwd());
		pstmt.setString(3, userDTO.getEmail());
		pstmt.setString(4, userDTO.getPhone());
		pstmt.setString(5, userDTO.getRegCode());
		recordCount = pstmt.executeUpdate();
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		logger.debug("Function UserDAO Register Ends "+recordCount);
		return recordCount>0;
		
	}

}
