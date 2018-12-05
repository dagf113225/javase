package com.lixin.ch8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

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

	public void execProcedure()
	{
		//{call 存储过程名字(参数)}
		String sql = "{call   p_checkuser(?,?,?)}";

		try
		{
			CallableStatement cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, "李涛");
			cstmt.setString(2, "12134");
			
			//字符串类型Types.VARCHAR
			cstmt.registerOutParameter(3, Types.VARCHAR);
			
			
			//执行存储过程
			cstmt.execute();
			
			String s=cstmt.getString(3);
			System.out.println("s--->"+s);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(null!=conn)
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
	
	public static void main(String[] args)
	{
		DB db = new DB();
		db.execProcedure();
	}

}
