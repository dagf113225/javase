package com.lixin.dao.db.impl;

import java.util.List;

import com.lixin.dao.db.interfaces.AbstractDB;
import com.lixin.dao.db.interfaces.DB;

public class OracleDBImpl extends AbstractDB  implements DB
{
	
	public OracleDBImpl()
	{
		this("oracle.jdbc.driver.OracleDriver",
				"jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");
	}

	public OracleDBImpl(String driver, String url, String username,
			String password)
	{
		super(driver,url,username,password);
		// TODO Auto-generated constructor stub
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