package com.lixin.ch7;

import javax.security.auth.login.AccountException;

/**
 * try...catch..积极处理
 * throws  throw 消极处理
 * 
 * 区分检查异常和非检查异常
 * ClassNotFoundException ,SqlException 属于检查异常
 * 1.积极处理:try...catch.. 2.消极处理，一定要声明这个异常
 * 
 * @author lenovo
 *
 */
public class Test3
{
	//1.throw在方法体内明确的抛出一个异常，在方法上一定要声明这个异常。
	//1.1throw在方法体内明确的抛出一个检查异常，这个方法上一定需要声明这个异常。
	//1.2throw在方法体内明确的抛出一个非检查异常，这个方法上可以不声明这个异常。
	
	//办理结婚证方法throws-->只能修饰方法，这个方法有可能引发异常
	public  void    show(int  age)
	{
		//年龄小于18
		if(age<18)
		{
			//throw抛出异常，中断流程
			throw  new ArithmeticException("小毛娃，还结婚........");
			
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
