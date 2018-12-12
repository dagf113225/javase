package com.lixin.dao.db.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lixin.dao.db.interfaces.DB;

public class MysqlDBImpl   implements DB
{
	private Connection conn;
	
	public MysqlDBImpl()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");
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

	@Override
	public int getCount(String tableName)
	{
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

		return count;
	}

}
