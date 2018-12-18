package com.lixin.lesson26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleServerOperator
{

	private Connection conn;

	public OracleServerOperator()
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

	public void operatorDB(DB db, String username)
	{
		String sql = "select  stuname||',����Ϊ'||money||',��������Ϊ,'||stubirthday||',������:'||stuaddress info   from  t_students  where stuname=?";

		String msg = "";

		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, username);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{
				msg = rs.getString(1);
			}
			System.out.println("���ݿ��ѯ���....");
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ݿ��ѯ���....׼�����ͽ��");

		try
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �ص�OracleDB���ʵ�ַ���
		db.queryDatas(msg);

	}

}
