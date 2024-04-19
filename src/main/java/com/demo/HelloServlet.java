package com.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher rd=req.getRequestDispatcher("header.html");
		rd.include(req, resp);
		
		RequestDispatcher rd1=req.getRequestDispatcher("home.html");
		rd1.include(req, resp);
		
		RequestDispatcher rd2=req.getRequestDispatcher("footer.html");
		rd2.include(req, resp);		
		
	}

}
