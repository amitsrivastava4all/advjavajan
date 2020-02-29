<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.brainmentors.exam.dto.UserDTO"%>
    <%@ page import="com.brainmentors.exam.dao.UserDAO"
     buffer="30kb" autoFlush="false"  errorPage="error.jsp" isThreadSafe="false" 
     trimDirectiveWhitespaces="true"
    
      %>
      <!--  this page is created by Amit -->
      <%-- <%@ taglib prefix="" uri="" %> --%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Register Here</title>
  </head>
  <body>
  <%@include file="header.jsp" %>
  <jsp:include page="about.jsp"/>
  <%! // this code will be a part of class member
  private int count; //instance variable
  %>
  <%=count %>
  <%
  // this code will go in service
  	x++;
  out.println("X is "+x);
  	String regCode = request.getParameter("regcode");
  String userid = request.getParameter("userid");
  String pwd = request.getParameter("pwd");
  String email = request.getParameter("email");
  String phone = request.getParameter("phone");
 UserDTO userDTO = new UserDTO();
 if(regCode!=null && userid!=null){
	 userDTO.setRegCode(regCode);
	 userDTO.setUserid(userid);
	 userDTO.setEmail(email);
	 userDTO.setPwd(pwd);
	 userDTO.setPhone(phone);
	 UserDAO userDAO = new UserDAO();
	 try{
	 boolean result = userDAO.register(userDTO);
	 String message = result?"Register SuccessFully":"Not able to register";
 	out.println(message);
	 }
	 catch(NamingException | SQLException e){
		 System.out.println(e);
	 }
 	//out.flush();
 }
  %>
  	<div class='container'>
  		<h1>Student Register Here      	</h1>
  		
  		
  		
  		<form action='register.jsp' method="post">
  		<div class='form-group'>
  		
  		
  		
  		<label>RegCode</label>
  		
  		
  		<input name='regcode' class='form-control' type='text' placeholder="Type Reg Code Here">
  		</div>
  		<div class='form-group'>
  		<label>Userid</label>
  		<input name='userid' class='form-control' type='text' placeholder="Type Userid Here">
  		</div>
  		<div class='form-group'>
  		<label>Password</label>
  		<input name='pwd' class='form-control' type='password' placeholder="Type Password Here">
  		</div>
  		<div class='form-group'>
  		<label>Email</label>
  		<input name='email' class='form-control' type='email' placeholder="Type Email Here">
  		</div>
  		<div class='form-group'>
  		<label>Phone</label>
  		<input name='phone' class='form-control' type='text' placeholder="Type Phone Here">
  		</div>
  		<div class='form-group'>
  		
  		<button type='submit' class='btn btn-primary'>Register</button>
  		</div>
  		</form>
  	</div>
    

    
  </body>
</html>