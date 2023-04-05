package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDaoImp implements DeleteDao {
	private String result;
	
	@Override
	public String deleteMessage(int sn) {
		// TODO Auto-generated method stub
		
		try {
	    Connection con = ConnectionFactory.getConnection();
		String sql="delete from message where sn=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, sn);
		int i = ps.executeUpdate();
		if(i==1)result="deleted";
		
		} catch (Exception e) {
			System.out.println("DeleteDaoImp:deleteMessage->"+e);
			result="exp";
		}
		finally
		{
		return result;
		}
	}
	@Override
	public String deleteProject(int sn) {
		try {
		    Connection con = ConnectionFactory.getConnection();
			String sql="delete from project where sn=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, sn);
			int i = ps.executeUpdate();
			if(i==1)result="deleted";
			
			} catch (Exception e) {
				System.out.println("DeleteDaoImp:deleteProject->"+e);
				result="exp";
			}
			finally
			{
			return result;
			}
	}
	@Override
	public String deleteExperience(int sn) {
		try {
		    Connection con = ConnectionFactory.getConnection();
			String sql="delete from exp where sn=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, sn);
			int i = ps.executeUpdate();
			if(i==1)result="deleted";
			
			} catch (Exception e) {
				System.out.println("DeleteDaoImp:deleteExperience->"+e);
				result="exp";
			}
			finally
			{
			return result;
			}

	}
	@Override
	public String deleteEducation(int sn) {
		
		try {
		    Connection con = ConnectionFactory.getConnection();
			String sql="delete from edu where sn=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, sn);
			int i = ps.executeUpdate();
			if(i==1)result="deleted";
			
			} catch (Exception e) {
				System.out.println("DeleteDaoImp:deleteEducation->"+e);
				result="exp";
			}
			finally
			{
			return result;
			}

	}

}


