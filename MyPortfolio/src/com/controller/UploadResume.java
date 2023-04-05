package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class UploadResume extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("resume");
		InputStream is = part.getInputStream();
		byte[] b=is.readAllBytes();
		//alternative->inputstream.readAllBytes()
		String path = "D:\\Java Adv\\MyPortfolio\\WebContent\\resume\\"+"myresume.pdf";
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(b);
		
		HttpSession session = request.getSession();
		session.setAttribute("msg", "File Uploaded Successfully");
		response.sendRedirect("uploadResume.jsp");
		
	}

	}


