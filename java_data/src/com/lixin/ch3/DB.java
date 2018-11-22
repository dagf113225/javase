package com.lixin.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DB
{

	Connection conn;

	public DB()
	{
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
	}

	public String[][] getDatas()
	{

		String[][] datas = null;
		try
		{
			PreparedStatement pstmt = conn
					.prepareStatement("SELECT  tname,turl  FROM   t_menu");

			ResultSet rs = pstmt.executeQuery();
			
			//��ȡ�е���Ϣ
			ResultSetMetaData  rsmd=rs.getMetaData();
			int  columns=rsmd.getColumnCount();
			
			System.out.println("columns-->"+columns);

			int row = 0;

			while (rs.next())
			{
				row++;
			
			}
			System.out.println(row);
			//����˶�ά�����ʵ����[9][2]
			datas = new String[row][columns];
			
			
			//�ص���һ��  mysql�Ľ�����ǿɹ���
			rs.beforeFirst();
			
			int  count=0;
			
		
			while(rs.next())//��ȡ��
			{
				//������
				for(int  i=0;i<columns;i++)
				{
					datas[count][i]=rs.getString(i+1);
				}
				
				count++;
			
			}
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  datas;
	}

	public static void main(String[] args)
	{
		DB db = new DB();
		String[][] datas=db.getDatas();
		
		for(int i=0;i<datas.length;i++)
		{
			for(int  j=0;j<datas[i].length;j++)
			{
				System.out.print(datas[i][j]+"     ,");
			}
			System.out.println("");
		}
	}
}
