package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DeleteDaoImp;

/**
 * Servlet implementation class DeleteExperience
 */
public class DeleteExperience extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String res = new DeleteDaoImp().deleteExperience( Integer.parseInt(request.getParameter("sn")));
		
		HttpSession session = request.getSession();
		if(res.equals("deleted"))
		{
		   session.setAttribute("msg", "Content Deleted Sucessfully");
		   response.sendRedirect("readAllExperience.jsp");
		}
		else
		{
			session.setAttribute("msg", "Something went wrong");
			response.sendRedirect("readAllExperience.jsp");
		}
	}

}
