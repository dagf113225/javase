package com.lixin.dao.db.impl;


import java.util.List;

import com.lixin.dao.db.interfaces.AbstractDB;
import com.lixin.dao.db.interfaces.DB;


public class MysqlDBImpl extends AbstractDB    implements DB 
{
	public MysqlDBImpl()
	{
		//super();
		this("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");
	}

	public MysqlDBImpl(String driver, String url, String username,String password)
	{
	
		// TODO Auto-generated constructor stub
		super(driver,url,username,password);
		//super("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/thzmdb2", "root", "123456");
	}

	

	@Override
	public double getStuMoney(String name)
	{
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public List QueryPageModel(int CurrentPageNum, int pageNum)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
