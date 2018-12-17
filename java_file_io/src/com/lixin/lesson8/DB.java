package com.lixin.lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DB
{

	private Connection conn;

	public DB()
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

	public List queryClasses(String tableName)
	{
		String sql = "SELECT  *  FROM  t_classes";

		List<Classes> lists = new ArrayList<Classes>();

		PreparedStatement pstmt = null;
		try
		{
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				Classes c = new Classes();
				c.setCid(rs.getInt(1));
				c.setCname(rs.getString(2));
				c.setCaddress(rs.getString(3));
				c.setCqq(rs.getString(4));

				lists.add(c);
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

		return lists;

	}

	public List queryDatas(String tableName)
	{
		String sql = "SELECT  *  FROM  " + tableName;

		List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();

		PreparedStatement pstmt = null;
		try
		{
			pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next())
			{
				Map<String, Object> maps = new HashMap<String, Object>();
				for (int i = 0; i < rsmd.getColumnCount(); i++)
				{
					maps.put(rsmd.getColumnName(i + 1), rs.getObject(i + 1));
				}

				lists.add(maps);
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

		return lists;

	}

}
