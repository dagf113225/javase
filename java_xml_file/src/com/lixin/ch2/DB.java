package com.lixin.ch2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Hashtable;

public class DB
{
	DBBean dbbean;

	Hashtable<String, String> sqltables;

	private Connection conn;

	public DB(DBBean dbbean, Hashtable<String, String> sqltables)
	{

		this.sqltables = sqltables;

		try
		{
			Class.forName(dbbean.getDriver());

			conn = DriverManager.getConnection(dbbean.getUrl(),
					dbbean.getUsername(), dbbean.getUserpwd());
			System.out.println("数据库连接成功" + conn);
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

	// 硬编码 硬写sql，会造成耦合度太高
	public void queryEmpMoney()
	{
		String sql = this.sqltables.get("queryempmoney");

		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				System.out.println(rs.getString(1) + "-->" + rs.getDouble(2));
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
	} 
	public  void  queryEmp(int CurrentNum)
	{
		String sql= this.sqltables.get("queryeemp");
		System.out.println("sql-->"+sql);
		
		PreparedStatement pstmt=null;
		try
		{
			pstmt = conn.prepareStatement(sql);
			
			if(sql.toLowerCase().contains("limit"))
			{
				pstmt.setInt(1, (CurrentNum-1)*2);
				pstmt.setInt(2, 2);
			}
			else 
			{
				pstmt.setInt(1,CurrentNum*2 );
				pstmt.setInt(2, (CurrentNum-1)*2);
			}
			
			ResultSet rs = pstmt.executeQuery(); 
			ResultSetMetaData  msmd=rs.getMetaData();
			
			while(rs.next())
			{
				for(int i=0;i<msmd.getColumnCount();i++)
				{
					System.out.print(rs.getObject(i+1));
				}
				System.out.println();
			}
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
