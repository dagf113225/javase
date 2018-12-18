package com.lixin.lesson26;

import java.util.Scanner;

public class Test
{

	public static void main(String[] args)
	{
		DB db = null;

		System.out.println("ÇëÄãÑ¡ÔñÊý¾Ý¿â....");
		Scanner s = new Scanner(System.in);

		String dbName = s.next();

		if (dbName.equals("oracle"))
		{
			OracleServerOperator osp = new OracleServerOperator();

			db = new OracleDB(osp);
		}
		else
		{
			MysqlServerOperator osp = new MysqlServerOperator();

			db = new MysqlDB(osp);
		}
		
		db.registerFuntion("¶¡¿­");
		

	}
}
