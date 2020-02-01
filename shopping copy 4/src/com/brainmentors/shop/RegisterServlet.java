package com.brainmentors.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.brainmentors.shop.dao.users.UserDAO;
import com.brainmentors.shop.dto.users.UserDTO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		UserDAO userDAO = new UserDAO();
		PrintWriter out = response.getWriter();
		String msg = "";
		String link = "<a href='index.html'>Login Here</a>";
		response.setContentType("text/html");
		try {
			boolean result = userDAO.create(userDTO);
			 msg = result?"Register SuccessFully "+link:"Unable to Register";
			out.println(msg);
			out.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			msg = "Error During Register";
			out.println(msg);
			e.printStackTrace();
		}
	}

}
