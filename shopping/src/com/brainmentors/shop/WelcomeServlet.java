package com.brainmentors.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{
	int counter;
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		PrintWriter out = res.getWriter();
		if(userid.equals(pwd)) {
			out.println("Welcome "+userid);
		}
		else {
			out.println("Invalid Userid or Password");
		}
		
			counter++;
			out.println("<h1>Hello Client "+counter+"</h1>");
			out.close();
	}
}