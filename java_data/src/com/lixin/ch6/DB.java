package com.lixin.ch6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public  void  execSql(String name)
	{
		String sql="select round(tsalary/(select  sum(tsalary)  from t_employee ),3) from " +
				" t_employee  where tname=?";
		
		try
		{
			PreparedStatement  pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			ResultSet  rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getDouble(1));
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public  void  queryPage(int pageNum)
	{
		String sql="select  *  from (select  rownum  rm,  e.* from   t_employee   " +
				" e where rownum<=?) temp  where  temp.rm>?";
		
		try
		{
			PreparedStatement  pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, pageNum*FixedValue.PAGE_SIZE);
			pstmt.setInt(2, (pageNum-1)*FixedValue.PAGE_SIZE);
			ResultSet  rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getString(2)+","+rs.getString(3));
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
		//db.execSql("¶¡¿­");
		db.queryPage(3);
	}
}
