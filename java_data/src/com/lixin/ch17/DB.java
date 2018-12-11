package com.lixin.ch17;

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
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager
					.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
							"student", "student");
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

		String s = Constan.EMPLOYEE_KEY;
		//截取
		String tableName = s.substring(0, s.indexOf(";"));

		System.out.println("tableName-->" + tableName);
		
		String  s1= Constan.EMPLOYEE_KEY.substring(s.indexOf(";")+1);
		
		System.out.println(s1);
		
		String[]  ss=s1.split(",");

		List lists = db.queryDatas(tableName);
		
		System.out.println(lists.size());

		for (int i = 0; i < lists.size(); i++)
		{
			Map map = (Map) lists.get(i);
			
			for(String  key:ss)
			{
				System.out.println(map.get(key));
			}
			//System.out.println(map.get("STUNAME"));
			
			
		}
	}

}
