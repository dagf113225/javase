package com.lixin.lesson3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

/**
 * 1.王启明 总经理 ，什么功能都可以操作 2.孔虎强 工人，什么功能都不能操作
 * 
 * @author lenovo
 * 
 */
public class Test
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("-------请输入你的姓名:---------");

			Scanner s = new Scanner(System.in);

			String username = s.next();

			System.out.println("你的姓名是:" + username);

			System.out.println("-------请输入你想执行的功能:---------");

			Scanner s1 = new Scanner(System.in);

			String fun = s1.next();

			System.out.println("你想执行的功能:" + fun);

			//queryMoney
			
			//面向对象很难去实现我们控制权限的意图
			DB db  = new DB();
			
			List<String>  lists=db.queryStuBindFun(username);
			
			//怎么判断这个人有没有权限呢 ?
			//System.out.println(lists.contains(fun));
			
			//全部匹配
			if(lists.contains(fun))
			{
				System.out.println(username+",可以执行"+fun);
				
				
				//面向对象很难去实现我们执行权限业务方法的意图
				//ExecAction  ea  = new ExecAction();
				//ea.updatePwd();
				
			
				try
				{	//使用反射
					Class  c=Class.forName("com.lixin.lesson3.ExecAction");
					Method  m=c.getDeclaredMethod(fun, null);
					m.invoke(c.newInstance(), null);
				}
				catch (ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (NoSuchMethodException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (SecurityException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IllegalAccessException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IllegalArgumentException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (InvocationTargetException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (InstantiationException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			else
			{
				System.out.println(username+",权限不够....s");
			}
			
		}
		
	}
}
