package com.lixin.ch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class DB
{

	public Connection connDB()
	{

		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");
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
		return conn;
	}

	// public String[] getClassNames()
	// {
	// String sql = "SELECT  cname  FROM  t_classes";
	//
	// String sql1 = "SELECT  COUNT(*)  FROM  t_classes";
	//
	// // ʹ������װ���ݵ��ǱȽ��鷳�鷳�鷳�鷳�鷳�鷳
	// String[] datas = null;
	//
	// Connection conn = this.connDB();
	//
	// try
	// {
	// PreparedStatement pstmt = conn.prepareStatement(sql1);
	//
	// ResultSet rs = pstmt.executeQuery();
	//
	// int count = 0;
	// while (rs.next())
	// {
	// count = rs.getInt(1);
	// }
	// datas = new String[count];
	//
	//
	//
	// pstmt = conn.prepareStatement(sql);
	// rs = pstmt.executeQuery();
	//
	// int row=0;
	// while (rs.next())
	// {
	// datas[row++]=rs.getString(1);//datas[0]=java datas[1]=python datas[2]=go
	// }
	// }
	// catch (SQLException e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// return datas;
	//
	// }

	public String[] getClassNames()
	{
		String sql = "SELECT  cname  FROM  t_classes";

		String[] datas = null;

		Connection conn = this.connDB();

		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			int count = 0;

			while (rs.next())
			{
				++count;
			}

			datas = new String[count];

			//mysql�Ľ����rsĬ���ǿ��Թ�����
			rs.beforeFirst();

			int row = 0;
			while (rs.next())
			{
				datas[row++] = rs.getString(1);
			}

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return datas;
	}

	public static void main(String[] args)
	{
		DB db = new DB();
		String[] ss = db.getClassNames();

		System.out.println(ss.length);

		for (String s : ss)
		{
			System.out.println("�༶����:" + s);
		}
	}

}
