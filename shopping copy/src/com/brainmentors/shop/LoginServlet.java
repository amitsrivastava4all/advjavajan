package com.brainmentors.shop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet { 
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doPost(req, res);
	}
	private String getDesign(String userid) {
		String result= " <!doctype html> <html lang='en'> <head> <meta charset='utf-8'> <meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'> <meta name='description' content=''> <meta name='author' content='Mark Otto, Jacob Thornton, and Bootstrap contributors'> <meta name='generator' content='Jekyll v3.8.6'> <title>Dashboard Template · Bootstrap</title>\n" + 
				"\n" + 
				" <link rel='canonical' href='https://getbootstrap.com/docs/4.4/examples/dashboard/'>\n" + 
				"\n" + 
				" <!-- Bootstrap core CSS --> <link href='https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>\n" + 
				"\n" + 
				" <!-- Favicons --> <link rel='apple-touch-icon' href='/docs/4.4/assets/img/favicons/apple-touch-icon.png' sizes='180x180'> <link rel='icon' href='/docs/4.4/assets/img/favicons/favicon-32x32.png' sizes='32x32' type='image/png'> <link rel='icon' href='/docs/4.4/assets/img/favicons/favicon-16x16.png' sizes='16x16' type='image/png'> <link rel='manifest' href='/docs/4.4/assets/img/favicons/manifest.json'> <link rel='mask-icon' href='/docs/4.4/assets/img/favicons/safari-pinned-tab.svg' color='#563d7c'> <link rel='icon' href='/docs/4.4/assets/img/favicons/favicon.ico'> <meta name='msapplication-config' content='/docs/4.4/assets/img/favicons/browserconfig.xml'> <meta name='theme-color' content='#563d7c'> \n" + 
				"\n" + 
				" <style> .bd-placeholder-img { font-size: 1.125rem; text-anchor: middle; -webkit-user-select: none; -moz-user-select: none; -ms-user-select: none; user-select: none; }\n" + 
				"\n" + 
				" @media (min-width: 768px) { .bd-placeholder-img-lg { font-size: 3.5rem; } } </style> <!-- Custom styles for this template --> <link href='dashboard.css' rel='stylesheet'> </head> <body> <nav class='navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow'> <a class='navbar-brand col-sm-3 col-md-2 mr-0' href='#'>Company name</a> <input class='form-control form-control-dark w-100' type='text' placeholder='Search' aria-label='Search'> <ul class='navbar-nav px-3'> <li class='nav-item text-nowrap'> <a class='nav-link' href='#'>Sign out</a> </li> </ul> </nav>\n" + 
				"\n" + 
				"<div class='container-fluid'> <div class='row'> <nav class='col-md-2 d-none d-md-block bg-light sidebar'> <div class='sidebar-sticky'> <ul class='nav flex-column'> <li class='nav-item'> <a class='nav-link active' href='#'> <span data-feather='home'></span> Dashboard <span class='sr-only'>(current)</span> </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='file'></span> Orders </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='shopping-cart'></span> Products </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='users'></span> Customers </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='bar-chart-2'></span> Reports </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='layers'></span> Integrations </a> </li> </ul>\n" + 
				"\n" + 
				" <h6 class='sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted'> <span>Saved reports</span> <a class='d-flex align-items-center text-muted' href='#' aria-label='Add a new report'> <span data-feather='plus-circle'></span> </a> </h6> <ul class='nav flex-column mb-2'> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='file-text'></span> Current month </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='file-text'></span> Last quarter </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='file-text'></span> Social engagement </a> </li> <li class='nav-item'> <a class='nav-link' href='#'> <span data-feather='file-text'></span> Year-end sale </a> </li> </ul> </div> </nav>\n" + 
				"\n" + 
				" <main role='main' class='col-md-9 ml-sm-auto col-lg-10 px-4'> <div class='d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom'> <h1 class='h2'>Welcome "+userid+"</h1> <div class='btn-toolbar mb-2 mb-md-0'> <div class='btn-group mr-2'> <button type='button' class='btn btn-sm btn-outline-secondary'>Share</button> <button type='button' class='btn btn-sm btn-outline-secondary'>Export</button> </div> <button type='button' class='btn btn-sm btn-outline-secondary dropdown-toggle'> <span data-feather='calendar'></span> This week </button> </div> </div>\n" + 
				"\n" + 
				" <canvas class='my-4 w-100' id='myChart' width='900' height='380'></canvas>\n" + 
				"\n" + 
				" <h2>Section title</h2> <div class='table-responsive'> <table class='table table-striped table-sm'> <thead> <tr> <th>#</th> <th>Header</th> <th>Header</th> <th>Header</th> <th>Header</th> </tr> </thead> <tbody> <tr> <td>1,001</td> <td>Lorem</td> <td>ipsum</td> <td>dolor</td> <td>sit</td> </tr> <tr> <td>1,002</td> <td>amet</td> <td>consectetur</td> <td>adipiscing</td> <td>elit</td> </tr> <tr> <td>1,003</td> <td>Integer</td> <td>nec</td> <td>odio</td> <td>Praesent</td> </tr> <tr> <td>1,003</td> <td>libero</td> <td>Sed</td> <td>cursus</td> <td>ante</td> </tr> <tr> <td>1,004</td> <td>dapibus</td> <td>diam</td> <td>Sed</td> <td>nisi</td> </tr> <tr> <td>1,005</td> <td>Nulla</td> <td>quis</td> <td>sem</td> <td>at</td> </tr> <tr> <td>1,006</td> <td>nibh</td> <td>elementum</td> <td>imperdiet</td> <td>Duis</td> </tr> <tr> <td>1,007</td> <td>sagittis</td> <td>ipsum</td> <td>Praesent</td> <td>mauris</td> </tr> <tr> <td>1,008</td> <td>Fusce</td> <td>nec</td> <td>tellus</td> <td>sed</td> </tr> <tr> <td>1,009</td> <td>augue</td> <td>semper</td> <td>porta</td> <td>Mauris</td> </tr> <tr> <td>1,010</td> <td>massa</td> <td>Vestibulum</td> <td>lacinia</td> <td>arcu</td> </tr> <tr> <td>1,011</td> <td>eget</td> <td>nulla</td> <td>Class</td> <td>aptent</td> </tr> <tr> <td>1,012</td> <td>taciti</td> <td>sociosqu</td> <td>ad</td> <td>litora</td> </tr> <tr> <td>1,013</td> <td>torquent</td> <td>per</td> <td>conubia</td> <td>nostra</td> </tr> <tr> <td>1,014</td> <td>per</td> <td>inceptos</td> <td>himenaeos</td> <td>Curabitur</td> </tr> <tr> <td>1,015</td> <td>sodales</td> <td>ligula</td> <td>in</td> <td>libero</td> </tr> </tbody> </table> </div> </main> </div> </div> <script src='https://code.jquery.com/jquery-3.4.1.slim.min.js' integrity='sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n' crossorigin='anonymous'></script> <script>window.jQuery || document.write('<script src='/docs/4.4/assets/js/vendor/jquery.slim.min.js'><\\/script>')</script><script src='/docs/4.4/dist/js/bootstrap.bundle.min.js' integrity='sha384-6khuMg9gaYr5AxOqhkVIODVIvm9ynTT5J4V1cfthmT+emCG6yVmEZsRHdxlotUnm' crossorigin='anonymous'></script> <script src='https://cdnjs.cloudflare.com/ajax/libs/feather-icons/4.9.0/feather.min.js'></script> <script src='https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js'></script> <script src='dashboard.js'></script></body> </html> ";
	
	return result;
	}
		
	@Override
	public void doPost(HttpServletRequest request
			, HttpServletResponse res) throws IOException{
		String uid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String msg ="";
		PrintWriter out =res.getWriter();
		if((uid!=null && pwd!=null) && uid.equals(pwd)) {
			res.setContentType("text/html");
			out.println(getDesign(uid));
			//msg = "<b>Welcome "+uid+"</b>";
		}
		else {
			msg = "Invalid userid or Password";
			out.println(msg);
		}
		
		
		out.close();
				
	}
}