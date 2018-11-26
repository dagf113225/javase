package com.lixin.ch4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB
{

	private Connection conn;

	// ����oracle���ݿ�
	public void connDB()
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

	public String[] getStuNames()
	{
		String sql = "select  tname  from   t_stus";
		String[] datas = null;
		try
		{
			//����oracle���ݿ⣬һ��Ҫ���ò�ѯ�Ľ����Ϊ �ɹ����α�
			PreparedStatement pstmt = conn.prepareStatement(sql,
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = pstmt.executeQuery();

			int row = 0;

			while (rs.next())
			{
				row++;
			}
			datas = new String[row];
			
			//beforeFirst:����mysql,mysqlĬ�Ͼ��ǿɹ����Ľ����
			//beforeFirst:����oracle,oracleĬ����ֻ���ġ�
			rs.beforeFirst();

			int count = 0;
			while (rs.next())
			{

				datas[count++] = rs.getString(1);
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
		DB db  = new DB();
		db.connDB();
		String[] datas=db.getStuNames();
		
		for(String  data:datas)
		{
			System.out.println(data);
		}
	}

}
