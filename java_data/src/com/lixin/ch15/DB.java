package com.lixin.ch15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.lixin.ch13.Depts;

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
	
	public Set  queryDatas()
	{
		String sql="select  stunum,stuname,money,stuaddress from t_students";
	
		TreeSet  set  = new TreeSet();
		try
		{
			
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())// ÐÐ
			{
				Students  s = new Students();
				s.setSnum(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setMoney(rs.getDouble(3));
				s.setSaddress(rs.getString(4));
				
				set.add(s);
		
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
		return  set;
	}
	
	
	
	public static void main(String[] args)
	{
		DB  db = new DB();
		TreeSet set=(TreeSet)db.queryDatas();
		
		Iterator  its=set.iterator();
		
		while(its.hasNext())
		{
			Students s=(Students)its.next();
			
			System.out.println(s.getSnum()+"\t"+s.getSname()+"\t"+s.getMoney());
		}
	}

}
