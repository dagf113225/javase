package com.lixin.ch1;

import java.util.Scanner;

public class DBTest
{
	
	public static void main(String[] args)
	{
		DBBase  base = null;
		

		System.out.println("请问你想使用什么样的数据库?");
		Scanner  s  = new Scanner(System.in);
		String  dbName=s.next();
		
		//根据用户的输入，进行对象的动态的绑定
		if(dbName.equals("oracle"))
		{
			base=new OracleDB(DBFixedValue.ORACLE_DRIVER, 
				DBFixedValue.ORACLE_URL, DBFixedValue.ORACLE_USERNAME, DBFixedValue.ORACLE_USERPWD);
		}
		else  if(dbName.equals("mysql"))
		{
			
			base = new MysqlDB(DBFixedValue.MYSQL_DRIVER, 
			DBFixedValue.MYSQL_URL, DBFixedValue.MYSQL_USERNAME, DBFixedValue.MYSQL_USERPWD);
			
		}
		
        //方法重写
		base.getConn();
		
		
		
		
	}

}
