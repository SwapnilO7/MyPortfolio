package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ReadDaoImp;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		
		String login=new ReadDaoImp().login(userid,password);
		if(login.equals("exist"))
		{
			session.setAttribute("login", "exist");
			response.sendRedirect("admin.jsp");
			

		}
		else
		{
			session.setAttribute("msg", "userid or password does not exist");
			response.sendRedirect("adminAuth.jsp");
		}
	}

}
