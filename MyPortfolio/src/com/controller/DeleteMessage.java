package com.controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import com.dao.DeleteDaoImp;


public class DeleteMessage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String res = new DeleteDaoImp().deleteMessage( Integer.parseInt(request.getParameter("sn")));
		
		HttpSession session = request.getSession();
		if(res.equals("deleted"))
		{
		   session.setAttribute("msg", "Content Deleted Sucessfully");
		   response.sendRedirect("readAllMessage.jsp");
		}
		else
		{
			session.setAttribute("msg", "Something went wrong");
			response.sendRedirect("readAllMessage.jsp");
		}
		
}
}