package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class DownloadResume
 */
public class DownloadResume extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "D:\\Java Adv\\MyPortfolio\\WebContent\\resume\\"+"myresume.pdf";
		FileInputStream fis = new FileInputStream(path);
		byte[] b=fis.readAllBytes();
		fis.read(b);
		
		ServletOutputStream os = response.getOutputStream();
		response.setHeader("content-disposition", "filename=myresume.pdf");
		response.setContentType("application/octet-stream");  //for unknow data-> of any type
		
	}

}
