package com.lixin.ch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDB  extends DBBase
{

	public OracleDB(String className, String url, String username,
			String userpwd)
	{
		super(className, url, username, userpwd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getConn()
	{
		// TODO Auto-generated method stub
		try
		{
			Class.forName(this.getClassName());
			
			Connection conn=DriverManager.getConnection(this.getUrl(), this.getUsername(), this.getUserpwd());
		
		
			System.out.println("oracle-->"+conn);
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
