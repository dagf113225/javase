package com.lixin.ch10;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

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

	public void exec1()
	{
		String sql = "{call p_two(?)}";

		try
		{
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);

			cstmt.execute();

			ResultSet rs = (ResultSet) cstmt.getObject(1);
			while (rs.next())
			{
				System.out.println(rs.getString(1) + "," + rs.getString(2)
						+ "," + rs.getInt(3));
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
	}

	public void exec2(String dname, String jname)
	{
		String sql = "{call p_three(?,?,?,?,?,?)}";

		try
		{
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dname);
			cstmt.setString(2, jname);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.registerOutParameter(4, OracleTypes.CURSOR);
			cstmt.registerOutParameter(5, Types.VARCHAR);
			cstmt.registerOutParameter(6, Types.VARCHAR);
			cstmt.execute();
			
			String s1=cstmt.getString(5);
			System.out.println("s1-->"+s1);
			
			String s2=cstmt.getString(6);
			System.out.println("s2-->"+s2);
			
			if(null==s1||"".equals(s1))
			{
				int count=cstmt.getInt(3);
				
				System.out.println(dname+",这个部门的员工数量为:"+count);
			}
			else
			{
				System.out.println(dname+","+s1);
			}
				
			if(null==s2||"".equals(s2))
			{
				
				 ResultSet  rs= (ResultSet)cstmt.getObject(4);
				 
				 while(rs.next())
				 {
					 System.out.println(rs.getString(1)+","+rs.getString(2));
				 }
			}
			else
			{
				System.out.println(jname+","+s2);
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
	}
	public  void  exec3()
	{
		String sql="{?=call f_one(?)}";
		
		try
		{
			CallableStatement  cstmt=conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2,"质量部");
			
			cstmt.execute();
			
			System.out.println(cstmt.getInt(1));
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public  void  exec4()
	{
		String sql="{?=call f_exec(?)}";
		
		try
		{
			CallableStatement  cstmt=conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2,"t_employee");
			
			cstmt.execute();
			
			System.out.println(cstmt.getInt(1));
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public  void  exec5()
	{
		String sql="{?=call f_execone(?)}";
		
		try
		{
			CallableStatement  cstmt=conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2,"t_employee");
			
			cstmt.execute();
			
			ResultSet  rs=(ResultSet)cstmt.getObject(1);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2));
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public  void  exec6(String  tabelName,int pagecount,int currentPage)
	{
		String sql="{call p_modelpage(?,?,?,?,?,?)}";
		
		try
		{
			CallableStatement  cstmt=conn.prepareCall(sql);
			
			cstmt.setString(1, tabelName);
			cstmt.setInt(2, pagecount);
			cstmt.setInt(3, currentPage);
			
			cstmt.registerOutParameter(4, OracleTypes.CURSOR);
			cstmt.registerOutParameter(5, Types.INTEGER);
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			cstmt.execute();
			
			ResultSet  rs=(ResultSet)cstmt.getObject(4);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3));
			}
			System.out.println(cstmt.getInt(5));
			System.out.println(cstmt.getInt(6));
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


	public static void main(String[] args)
	{
		DB db = new DB();
		// db.exec1();
		//db.exec2("质量部", "工人111");
		// db.exec2("质量部", "工人");
		//db.exec6("t_employee",3,1);
		db.exec6("t_students",4,3);
	}

}
