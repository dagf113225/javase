package com.lixin.lesson3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

/**
 * 1.������ �ܾ��� ��ʲô���ܶ����Բ��� 2.�׻�ǿ ���ˣ�ʲô���ܶ����ܲ���
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
			System.out.println("-------�������������:---------");

			Scanner s = new Scanner(System.in);

			String username = s.next();

			System.out.println("���������:" + username);

			System.out.println("-------����������ִ�еĹ���:---------");

			Scanner s1 = new Scanner(System.in);

			String fun = s1.next();

			System.out.println("����ִ�еĹ���:" + fun);

			//queryMoney
			
			//����������ȥʵ�����ǿ���Ȩ�޵���ͼ
			DB db  = new DB();
			
			List<String>  lists=db.queryStuBindFun(username);
			
			//��ô�ж��������û��Ȩ���� ?
			//System.out.println(lists.contains(fun));
			
			//ȫ��ƥ��
			if(lists.contains(fun))
			{
				System.out.println(username+",����ִ��"+fun);
				
				
				//����������ȥʵ������ִ��Ȩ��ҵ�񷽷�����ͼ
				//ExecAction  ea  = new ExecAction();
				//ea.updatePwd();
				
			
				try
				{	//ʹ�÷���
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
				System.out.println(username+",Ȩ�޲���....s");
			}
			
		}
		
	}
}
