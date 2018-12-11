package com.lixin.ch18;

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

	// List具体的JavaBean
	public List queryDatas(String tableName)
	{

		List lists = new ArrayList();

		String sql = "select  * from   " + tableName;

		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			while (rs.next())// 行
			{
				Map map = new HashMap();// 对应一行

				for (int i = 0; i < rsmd.getColumnCount(); i++)
				{
					map.put(rsmd.getColumnName(i + 1), rs.getObject(i + 1));
				}

				lists.add(map);

			}
		}
		catch (SQLException e)
		{

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

	public static void main(String[] args)
	{
		DB db = new DB();

		List lists = db.queryDatas("t_classes");
		
		for(int i=0;i<lists.size();i++)
		{
			  Map  maps=(Map) lists.get(i);
			  
			  System.out.println(maps.get("cname"));
		}

	}
}
