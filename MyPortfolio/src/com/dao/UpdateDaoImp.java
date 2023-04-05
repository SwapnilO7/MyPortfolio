package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateDaoImp implements UpdateDao {
private String result;
	@Override
	public String updateCredentials(String userid, String password) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionFactory.getConnection();
			String sql="update login set userid=? , password=? where sn=1";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			ps.setString(2, password);
			
			int row=ps.executeUpdate();
			if(row==1)
			{
				result="updated";
			}
			
		}
		catch(Exception e)
		{
			System.out.println("UpdateDaoImp:UpdateCredentilas->"+e);
			result="exp";
			}
		finally
		{
		return result;	
		}
		
		
	}

}

