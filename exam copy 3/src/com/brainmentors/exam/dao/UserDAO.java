package com.brainmentors.exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import org.apache.log4j.Logger;

import com.brainmentors.exam.dto.UserDTO;

public class UserDAO {
	Logger logger = Logger.getLogger(UserDAO.class);
	public ArrayList<UserDTO> fetchUsers() throws NamingException, SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserDTO> users = new ArrayList<>();
		try {
			con = ConnectionUtils.getConnection();
			pstmt = con.prepareStatement("select * from user_mst");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserDTO user = new UserDTO();
				user.setRegCode(rs.getString("regcode"));
				user.setUserid(rs.getString("userid"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				users.add(user);
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
		
		return users;
	}
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
