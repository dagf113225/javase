package com.lixin.ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB
{
	Connection conn;
	public DB()
	{
		try
		{
			//加载数据库驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
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
	
	public void  execQuerySql()
	{
		String sql="select  *  from  t_stus";
		
		try
		{
			PreparedStatement  pstmt=conn.prepareStatement(sql);
			ResultSet  rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2));
			}
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		DB  db = new DB();
		db.execQuerySql();
	}

}
