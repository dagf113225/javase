package com.lixin.ch2;

import java.util.Hashtable;
import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		System.out.println("��������Ҫʲô�������ݿ�?oracle|mysql,��ѡ��:");
		
		//ͨ����������
		Scanner  s  = new Scanner(System.in);
		
		String  dbname=s.next();
		
		ParseDBConfig  p1=ParseDBConfig.getInstance(dbname);
		DBBean  bean =p1.getDbBean();
		//��ҿ��Բ���һ�£������㴴�����ٶ��󣬽����ļ���һ�Ρ�
		//ParseDBConfig  p2=ParseDBConfig.getInstance(dbname);
		Hashtable<String,String> sqltables =p1.getSqltables();
		DB  db  = new DB(bean,sqltables);
		//db.queryEmpMoney();
		db.queryEmp(2);
		
		
	}

}
