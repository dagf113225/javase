package com.lixin.ch0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//检查异常：jdbc,io,socket，反射，xml解析，注解

public class Test2
{

	public Test2()
	{

		try
		{
			// 1.加载数据库驱动，mysql数据驱动,驱动需要另外导入
			Class.forName("com.mysql.jdbc.Driver");

			// 2.连接数据库 url:jdbc:mysql://数据库ip地址:3306/数据库名
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");

			System.out.println("conn-->" + conn);
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

		System.out.println("----------------------");

	}

	public static void main(String[] args)
	{

		Test2 t = new Test2();

	}

}
