package com.lixin.ch0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//����쳣��jdbc,io,socket�����䣬xml������ע��

public class Test2
{

	public Test2()
	{

		try
		{
			// 1.�������ݿ�������mysql��������,������Ҫ���⵼��
			Class.forName("com.mysql.jdbc.Driver");

			// 2.�������ݿ� url:jdbc:mysql://���ݿ�ip��ַ:3306/���ݿ���
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
