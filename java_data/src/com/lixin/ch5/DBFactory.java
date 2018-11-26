package com.lixin.ch5;

public class DBFactory
{

	//DBFactory工厂类，static getDB-->静态工厂方法，根据名字生成不同的实例对象
	public static ABstractDB getDB(String name)
	{

		ABstractDB db = null;

		if (name.equals("oracle"))
		{
			db = new OracleDao("oracle.jdbc.driver.OracleDriver", 
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "student", "student");
		}
		else if (name.equals("mysql"))
		{
			db = new MySqlDao("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/db_nkj", "root",
					"123456");
		}
		
		return db;

	}

}
