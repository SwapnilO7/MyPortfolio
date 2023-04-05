package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDaoImp implements InsertDao{
	private String result;

	@Override
	public String saveMessage(String name, String email, String message) {
		
	try {
		Connection con=ConnectionFactory.getConnection();
		System.out.println("&&&&&&&&"+con);
		String sql="insert into message(name,email,message)values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, message);

		int row = ps.executeUpdate();
		if(row==1)this.result="saved";
		
	} 
	catch (Exception e) 
	{
		System.out.println("InsertDaoImp: saveMessage()->"+e);
		this.result="exp";
	}
	
	finally {
		return result;
	}
}
@Override
	public String saveProject(String filename) {
	try {
		Connection con=ConnectionFactory.getConnection();
		System.out.println("&&&&&&&&"+con);
		String sql="insert into project(filename) values(?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, filename);
		

		int row = ps.executeUpdate();
		if(row==1)this.result="saved";
		
	} 
	catch (Exception e) 
	{
		System.out.println("InsertDaoImp: saveProject()->"+e);
		this.result="exp";
	}
	
	finally {
		return result;
	}
}
}