package com.lixin.lesson26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlServerOperator
{
	
	private Connection conn;

	public MysqlServerOperator()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager
					.getConnection("jdbc:mysql://127.0.0.1:3306/thzmdb2",
							"root", "123456");
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
	
	
	public void  operatorDB(DB db, String username)
	{
		String sql = "SELECT  CONCAT(sname,',性别是:',ssex) FROM  t_students   WHERE   sname=?";

		String msg = "";

		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				msg = rs.getString(1);
			}
			System.out.println("数据库查询完毕....");
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("数据库查询完毕....准备发送结果");

		try
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 回调mysqlDB类的实现方法
		db.queryDatas(msg);
	}

}
