package com.lixin.ch5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ABstractDB
{

	private Connection conn;

	public ABstractDB(String driver, String url, String username, String userpwd)
	{
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.userpwd = userpwd;
	}

	private String driver;

	private String url;

	private String username;

	private String userpwd;

	public void getConnection()
	{
		try
		{
			Class.forName(this.driver);

			conn = DriverManager.getConnection(url, username, userpwd);
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
	
	
	//抽象方法String sql是sql语句，Object[]  params是传入参数
	public  abstract   String[]   getDatas(String sql,Object[]  params);


	public Connection getConn()
	{
		return conn;
	}


	public void setConn(Connection conn)
	{
		this.conn = conn;
	}

}
