package com.lixin.ch5;

public class DBFactory
{

	//DBFactory�����࣬static getDB-->��̬���������������������ɲ�ͬ��ʵ������
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
