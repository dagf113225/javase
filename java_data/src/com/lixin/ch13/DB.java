package com.lixin.ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
///多样性，存取数据库的手段特别的多。
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

	public Object[][] queryDatasOne(String tabelName)
	{
		String sql = "select  * from  " + tabelName;

		Object[][] datas = null;

		try
		{
			//oracle数据库需要设置游标的结果集ResultSet,设置为可滚动
			PreparedStatement pstmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = pstmt.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();

			int columnCount = rsmd.getColumnCount();

			int count = 0;

			while (rs.next())// 行
			{
				count++;

			}

			datas = new Object[count][columnCount];

			rs.beforeFirst();

			int row = 0;
			while (rs.next())// 行
			{
				for (int i = 0; i < columnCount; i++)
				{
					datas[row][i] = rs.getObject(i + 1);
				}

				row++;

			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
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
		return  datas;
	}

	public List queryDatas(String tabelName)
	{
		String sql = "select  * from  " + tabelName;

		List lists = new ArrayList();

		try
		{
			
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())// 行
			{
				Depts d = new Depts();// 这行代码污染了整个方法，缺乏通用性
				d.setDnum(rs.getInt(1));
				d.setDname(rs.getString(2));
				d.setDphone(rs.getString(3));
				

				lists.add(d);
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

		return lists;

	}

	public static void main(String[] args)
	{
		DB db = new DB();
		
		//Object[][]  datas=db.queryDatasOne("t_depts");
		//Object[][]  datas=db.queryDatasOne("t_employee");
		//System.out.println(datas.length);
		
		//系统中有100张表，我们是不是要建立100个方法去查询
	    List lists = db.queryDatas("t_employee");
		System.out.println("这个集合的大小为:" + lists.size());

		for (int i = 0; i < lists.size(); i++)
		{

			Object obj = lists.get(i);

			// 这个实例是不是Depts类的一个对象
			if (obj instanceof Depts)
			{
				Depts d = (Depts) lists.get(i);
				System.out.println(d.getDnum() + "\t" + d.getDname() + "\t"
						+ d.getDphone());
			}

		}
	}

}
