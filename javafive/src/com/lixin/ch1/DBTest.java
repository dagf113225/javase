package com.lixin.ch1;

import java.util.Scanner;

public class DBTest
{
	
	public static void main(String[] args)
	{
		DBBase  base = null;
		

		System.out.println("��������ʹ��ʲô�������ݿ�?");
		Scanner  s  = new Scanner(System.in);
		String  dbName=s.next();
		
		//�����û������룬���ж���Ķ�̬�İ�
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
		
        //������д
		base.getConn();
		
		
		
		
	}

}
