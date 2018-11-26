package com.lixin.ch5;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("请输入数据库名称:");
		Scanner  s  = new Scanner(System.in);
		
		String  dbName=s.next();
		
		//静态工厂方法，根据用户输入的名字得到不同的操作数据库的实例对象
		ABstractDB  db= DBFactory.getDB(dbName);
		
		//String sql="select     tname  from   t_employee  where " +
			//	" tdnum  in (select dnum  from   t_depts  where  dname=?)";
		
		//String[]  datas=db.getDatas(sql, new Object[]{"技术部"});
		
		String  sql="select  ename  from   t_emps";
		String[]  datas=db.getDatas(sql,new Object[]{});
		
		
		for(String data:datas)
		{
			System.out.println(data);
		}
		
		
	}

}
