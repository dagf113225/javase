package com.lixin.ch5;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("���������ݿ�����:");
		Scanner  s  = new Scanner(System.in);
		
		String  dbName=s.next();
		
		//��̬���������������û���������ֵõ���ͬ�Ĳ������ݿ��ʵ������
		ABstractDB  db= DBFactory.getDB(dbName);
		
		//String sql="select     tname  from   t_employee  where " +
			//	" tdnum  in (select dnum  from   t_depts  where  dname=?)";
		
		//String[]  datas=db.getDatas(sql, new Object[]{"������"});
		
		String  sql="select  ename  from   t_emps";
		String[]  datas=db.getDatas(sql,new Object[]{});
		
		
		for(String data:datas)
		{
			System.out.println(data);
		}
		
		
	}

}
