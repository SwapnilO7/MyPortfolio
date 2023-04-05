package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.pojo.Education;
import com.pojo.Experience;
import com.pojo.LoginDetails;
import com.pojo.Message;
import com.pojo.Project;
import com.dao.ReadDao;

	public class ReadDaoImp implements ReadDao{
		private String result;
		private LoginDetails l;
@Override
public ArrayList<Message> readAllMessage() {
	ArrayList<Message> al=new ArrayList<>();
	try 
	{
		Connection con=ConnectionFactory.getConnection();
		String sql="select * from message";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Message m=new Message();
			
			int sn=rs.getInt("sn");
			m.setSn(sn);
			
			String name=rs.getString("name");
			m.setName(name);
			

			String email=rs.getString("email");
			m.setEmail(email);
			

			String message=rs.getString("message");
			m.setMessage(message);
			
			al.add(m);
			
			
		}
	}catch(Exception e) {
		System.out.println("ReadDaoImp:readAllMessage->"+e);
	}
	finally
	{
		return al;
	}
}

public String login(String userid,String password)
{
	try
	{
		Connection con=ConnectionFactory.getConnection();
		String sql="select * from login where userid=? and password=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, userid);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			result="exist";
		}
		else
		{
			result="not exist";
		}
	}
	catch(Exception e)
	{
		result="exp";
		System.out.println("ReadDaoImp:login->"+e);
		}
	finally
	{
	return result;	
	}
	
	
}
@Override
public LoginDetails getLoginDetails() {
	try
	{
		Connection con=ConnectionFactory.getConnection();
		String sql="select * from login ";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		rs.next();
		this.l=new LoginDetails(rs.getInt("sn"),rs.getString("userid"),rs.getString("password"));
		
}
	catch(Exception e)
	{
		result="exp";
		System.out.println("ReadDaoImp:getLoginDetails->"+e);
	}
	finally
	{
		return l;
	}
}
@Override
	public ArrayList<Project> getProjectDetails(){
		ArrayList<Project> al=new ArrayList<>();
		try
		{
			Connection con=ConnectionFactory.getConnection();
			String sql="select * from project ";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Project m=new Project(rs.getInt("sn"),rs.getString("filename"));
				al.add(m);
			}
			
			
	}
		catch(Exception e)
		{
			result="exp";
			System.out.println("ReadDaoImp:getprojectDetails->"+e);
		}
		finally
		{
			return al;
		}
	}

@Override
public ArrayList<Experience> readAllExperience() {
	ArrayList<Experience> al=new ArrayList<>();
	try 
	{
		Connection con=ConnectionFactory.getConnection();
		String sql="select * from exp";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Experience m=new Experience();
			
			int sn=rs.getInt("sn");
			m.setSn(sn);
			
			String year=rs.getString("year");
			m.setYear(year);
			

			String title=rs.getString("title");
			m.setTitle(title);
			

			String subtitle=rs.getString("subtitle");
			m.setSubtitle(subtitle);
			
			String description=rs.getString("description");
			m.setDescription(description);
			al.add(m);
			
			
		}
	}catch(Exception e) {
		System.out.println("ReadDaoImp:readAllExperiences->"+e);
	}
	finally
	{
		return al;
	}
}

@Override
public ArrayList<Education> readAllEducation() {
	ArrayList<Education> al=new ArrayList<>();
	try 
	{
		Connection con=ConnectionFactory.getConnection();
		String sql="select * from edu";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Education m=new Education();
			
			int sn=rs.getInt("sn");
			m.setSn(sn);
			
			String year=rs.getString("year");
			m.setYear(year);
			

			String title=rs.getString("title");
			m.setTitle(title);
			

			String subtitle=rs.getString("subtitle");
			m.setSubtitle(subtitle);
			
			String description=rs.getString("description");
			m.setDescription(description);
			al.add(m);
			
			
		}
	}catch(Exception e) {
		System.out.println("ReadDaoImp:readAllEducation->"+e);
	}
	finally
	{
		return al;
	}
}
}