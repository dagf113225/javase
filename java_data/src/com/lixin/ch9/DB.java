package com.lixin.ch9;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DB
{
	private Connection  conn;
	public  DB()
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");
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
	public void exec(String  dname)
	{
		String sql="{call p_one(?,?,?)}";
		
		
		try
		{
			CallableStatement  cstmt=conn.prepareCall(sql);
			cstmt.setString(1, dname);
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			
			System.out.println(cstmt.getString(2));
			System.out.println(cstmt.getInt(3));
			
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{
		DB  db  =new DB();
		db.exec("Éú²ú²¿");
	}

}
