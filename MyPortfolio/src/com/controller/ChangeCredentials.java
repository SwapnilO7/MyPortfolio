package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UpdateDaoImp;

/**
 * Servlet implementation class ChangeCredentials
 */
public class ChangeCredentials extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		String updateCredentials=new UpdateDaoImp().updateCredentials(userid,password);
		if(updateCredentials.equals("updated"))
		{
			session.removeAttribute("login");
			session.setAttribute("msg", "credentials updated sucessfully");
			response.sendRedirect("adminAuth.jsp");
		}
		else
		{
			
		session.setAttribute("msg", "something went wrong");
		response.sendRedirect("changeCredentials.jsp");
	}

	}
}
