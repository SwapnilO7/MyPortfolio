package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import com.dao.DeleteDaoImp;
import com.dao.InsertDaoImp;
import com.validation.Validation;

/**
 * Servlet implementation class Project
 */
@MultipartConfig
public class Project extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String check =request.getParameter("check");
		
		if(check!=null)
		{
		if(check.equals("deleteProject"))
		{
			
			String sn=request.getParameter("sn");
			String filename=request.getParameter("filename");
			String resp = new DeleteDaoImp().deleteProject( Integer.parseInt(request.getParameter("sn")));
			
			
			if(resp.equals("deleted"))
			{
				try {
					
					String path="D:\\Java Adv\\MyPortfolio\\WebContent\\images\\myproject\\"+filename;
					new File(path).delete();
			   session.setAttribute("msg", "Project Content Deleted Sucessfully");
			   response.sendRedirect("projectSection.jsp");
			}
				catch(Exception e)
				{
					
				session.setAttribute("msg", "Something went wrong");
				   response.sendRedirect("projectSection.jsp");
				   
				}
			}
				else
				{
					session.setAttribute("msg", "Something went wrong");
					   response.sendRedirect("projectSection.jsp");
				}
			
		}
		}	
		Part part=request.getPart("project");
		String filename=part.getSubmittedFileName();
		System.out.println(filename);
	
		
		String res=new Validation().validateImage(part);
		if(res.equals("valid"))
		{
			String saveProject=new InsertDaoImp().saveProject(filename);
			if(saveProject.equals("saved"))
			{
				try
				{
					InputStream is=part.getInputStream();
					byte[] b=is.readAllBytes();
					
					String path="D:\\Java Adv\\MyPortfolio\\WebContent\\images\\myproject\\"+filename;
					FileOutputStream fos=new FileOutputStream(path);
					fos.write(b);
					
					session.setAttribute("msg", "File uploaded successfully");
					response.sendRedirect("addproject.jsp");
					
				}
				catch(Exception e)
				{
					System.out.println("Fileupload->"+e);
					session.setAttribute("msg", "Something went Wrong");
					response.sendRedirect("addproject.jsp");
				}
			}
			else
			{
				session.setAttribute("msg", "Something went wrong");
				response.sendRedirect("addproject.jsp");
			}
		}
		else
		{
			session.setAttribute("msg", res);
			response.sendRedirect("addproject.jsp");
		}
			}
	
	



}