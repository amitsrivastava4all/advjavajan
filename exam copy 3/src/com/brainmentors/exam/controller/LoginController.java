package com.brainmentors.exam.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.brainmentors.exam.dao.UserDAO;
import com.brainmentors.exam.dto.UserDTO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {//implements SingleThreadModel {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String regCode = request.getParameter("regcode");
		  String userid = request.getParameter("userid1");
		  String pwd = request.getParameter("pwd");
		  String email = request.getParameter("email");
		  String phone = request.getParameter("phone");
		  UserDTO userDTO = new UserDTO();
		  userDTO.setRegCode(regCode);
			 userDTO.setUserid(userid);
			 userDTO.setEmail(email);
			 userDTO.setPwd(pwd);
			 userDTO.setPhone(phone);
			 UserDAO userDAO = new UserDAO();
			 try{
			 boolean result = userDAO.register(userDTO);
			 String message = result?"Register SuccessFully":"Not able to register";
			 session.setAttribute("msg", message);
		 	  ArrayList<UserDTO> users = userDAO.fetchUsers();
		 	 session.setAttribute("users", users);
		 	  response.sendRedirect("welcome.jsp");
		 	  //RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		 	  //rd.forward(request, response);
			 }
			 catch(Exception e){
				 System.out.println(e);
			 }
	}

}
