 package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.InsertDaoImp;
import com.validation.Validation;
/**
 * Servlet implementation class SendMessage
 */
public class SendMessage extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");
		System.out.println(name+" "+email+" "+message);
		
		String res=new Validation().validateSendMessage(name,email,message);
		System.out.println(res);
		HttpSession session=request.getSession();
		if(res.equals("valid"))
		{
			System.out.println("****************");
			String saveMessage=new InsertDaoImp().saveMessage(name,email,message);
			if(saveMessage.equals("saved"))
			{
				System.out.println(saveMessage+"$$$$$$$$$$$$$$");
				
				session.setAttribute("msg","Message send successfully");
				response.sendRedirect("index.jsp");
			}
			else
			{session.setAttribute("msg","something went wrong");
			
				System.out.println(saveMessage);
				
				response.sendRedirect("index.jsp");
			}
		}
		else
		{
			session.setAttribute("msg",res);
			
			System.out.println(res);
			
			response.sendRedirect("index.jsp");
		}
		
			}
		}

