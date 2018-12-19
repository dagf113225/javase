package com.lixin.lesson28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.CountDownLatch;

public class DBThread extends Thread
{
	CountDownLatch c;

	User u;

	public DBThread(CountDownLatch c, User u)
	{
		this.c = c;
		this.u = u;
	}

	public void run()
	{
		System.out.println("启动备份数据库......");
		
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection conn =null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			 conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");
			
			
			PreparedStatement  pstmt=conn.prepareStatement("insert  into t_users(sname,spwd)  values(?,?)");
			
			pstmt.setString(1, u.getName());
			pstmt.setString(2, u.getPwd());
			
			pstmt.executeUpdate();
			
			
			c.countDown();
			

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
}
