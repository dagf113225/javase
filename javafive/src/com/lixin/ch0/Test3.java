package com.lixin.ch0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test3
{
	
	public void  aa()
	{
		
		try
		{
			//1.�������ݿ�����  ��������һ��java��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.�������ݿ�
			Connection  conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");
	  
			 System.out.println( conn);
		
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
	
	public static void main(String[] args)
	{
		Test3  t = new Test3();
		t.aa();
	}

}
