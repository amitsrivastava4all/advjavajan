package com.brainmentors.shop.dao.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.brainmentors.shop.dao.ConnectionUtils;
import com.brainmentors.shop.dto.users.UserDTO;

public class UserDAO implements QueryConstants{
	public UserDTO read(UserDTO userDTO) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserDTO userObject = new UserDTO();
		try {
		con = ConnectionUtils.getConnection();
		pstmt = con.prepareStatement(LOGIN_SQL);
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPassword());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			userObject.setUserid(userDTO.getUserid());
			userObject.setMessage("Welcome ");
		}
		else {
			userObject.setMessage("Invalid Userid or Password");
		}
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return userObject;
	}
	public boolean create(UserDTO userDTO) throws SQLException, ClassNotFoundException {
		Connection con  =null;
		PreparedStatement pstmt = null;
		try {
		con = ConnectionUtils.getConnection();
		pstmt  = con.prepareStatement(REGISTER_SQL);
		pstmt.setString(1, userDTO.getUserid());
		pstmt.setString(2, userDTO.getPassword());
		int recordInsert = pstmt.executeUpdate();
		if(recordInsert>0) {
			return true;
		}
		}
		finally {
			
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return false;
	}
	public void delete() {
		
	}
	public void update() {
	
	}

}
