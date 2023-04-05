package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DeleteDaoImp;

/**
 * Servlet implementation class DeleteEducation
 */
public class DeleteEducation extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String res = new DeleteDaoImp().deleteEducation( Integer.parseInt(request.getParameter("sn")));
		
		HttpSession session = request.getSession();
		if(res.equals("deleted"))
		{
		   session.setAttribute("msg", "Content Deleted Sucessfully");
		   response.sendRedirect("readAllEducation.jsp");
		}
		else
		{
			session.setAttribute("msg", "Something went wrong");
			response.sendRedirect("readAllEducation.jsp");
		}
	}
	}


