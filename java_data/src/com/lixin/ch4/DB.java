package com.lixin.ch4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB
{

	private Connection conn;

	// 连接oracle数据库
	public void connDB()
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

	public String[] getStuNames()
	{
		String sql = "select  tname  from   t_stus";
		String[] datas = null;
		try
		{
			//对于oracle数据库，一定要设置查询的结果集为 可滚动游标
			PreparedStatement pstmt = conn.prepareStatement(sql,
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = pstmt.executeQuery();

			int row = 0;

			while (rs.next())
			{
				row++;
			}
			datas = new String[row];
			
			//beforeFirst:对于mysql,mysql默认就是可滚动的结果集
			//beforeFirst:对于oracle,oracle默认是只进的。
			rs.beforeFirst();

			int count = 0;
			while (rs.next())
			{

				datas[count++] = rs.getString(1);
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return datas;

	}
	
	public static void main(String[] args)
	{
		DB db  = new DB();
		db.connDB();
		String[] datas=db.getStuNames();
		
		for(String  data:datas)
		{
			System.out.println(data);
		}
	}

}
