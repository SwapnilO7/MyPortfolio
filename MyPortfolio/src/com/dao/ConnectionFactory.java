package com.dao;

import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;





public class ConnectionFactory {
	private static Connection con;
	public static Connection getConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        MysqlDataSource sds = new MysqlDataSource();
			sds.setURL("jdbc:mysql://localhost:3306/myportfolio");
			sds.setUser("root");
		    sds.setPassword("");

			con = sds.getConnection();
			System.out.println(con);
			
		}
		catch (Exception e) 
		{
			System.out.println("Connection->"+e);
		}
		finally
		{
		  return con;
		}
	}
}