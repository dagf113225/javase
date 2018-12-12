package com.lixin.dao.db.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class AbstractDB
{

	public AbstractDB(String driver, String url, String username,
			String password)
	{
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;

		try
		{
			Class.forName(this.driver);

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("连接数据库成功....");
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

	protected String driver;

	protected String url;

	protected String username;

	protected String password;

	protected Connection conn;

	public int getCount(String tableName)
	{
		System.out.println("AbstractDB  is   getCount  start....");
		// TODO Auto-generated method stub
		String sql = "select  count(*)  from     " + tableName;

		int count = 0;
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				count = rs.getInt(1);
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			this.colseDB();
		}

		return count;
	}

	public void colseDB()
	{

		if (null != conn)
		{
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
