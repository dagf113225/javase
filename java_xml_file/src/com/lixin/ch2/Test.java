package com.lixin.ch2;

import java.util.Hashtable;
import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("请问你需要什么样的数据库?oracle|mysql,请选择:");
		
		//通过键盘输入
		Scanner  s  = new Scanner(System.in);
		
		String  dbname=s.next();
		
		ParseDBConfig  p1=ParseDBConfig.getInstance(dbname);
		DBBean  bean =p1.getDbBean();
		//大家可以测试一下，不管你创建多少对象，解析文件就一次。
		//ParseDBConfig  p2=ParseDBConfig.getInstance(dbname);
		Hashtable<String,String> sqltables =p1.getSqltables();
		DB  db  = new DB(bean,sqltables);
		//db.queryEmpMoney();
		db.queryEmp(2);
		
		
	}

}
