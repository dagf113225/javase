package com.lixin.ch7;

import javax.security.auth.login.AccountException;

/**
 * try...catch..��������
 * throws  throw ��������
 * 
 * ���ּ���쳣�ͷǼ���쳣
 * ClassNotFoundException ,SqlException ���ڼ���쳣
 * 1.��������:try...catch.. 2.��������һ��Ҫ��������쳣
 * 
 * @author lenovo
 *
 */
public class Test3
{
	//1.throw�ڷ���������ȷ���׳�һ���쳣���ڷ�����һ��Ҫ��������쳣��
	//1.1throw�ڷ���������ȷ���׳�һ������쳣�����������һ����Ҫ��������쳣��
	//1.2throw�ڷ���������ȷ���׳�һ���Ǽ���쳣����������Ͽ��Բ���������쳣��
	
	//������֤����throws-->ֻ�����η�������������п��������쳣
	public  void    show(int  age)
	{
		//����С��18
		if(age<18)
		{
			//throw�׳��쳣���ж�����
			throw  new ArithmeticException("Сë�ޣ������........");
			
		}
		else
		{
			//throw  new ClassNotFoundException();
		}
		
		
	
	}
	
	public static void main(String[] args)
	{
		Test3  t  = new Test3();
		try
		{
			t.show(20);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
