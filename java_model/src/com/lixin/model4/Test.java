package com.lixin.model4;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("�����û�ϲ��ʲô���Ķ���?");
			
			Scanner  s =  new Scanner(System.in);
			
			String  name=s.next();
			
			//����������û��������������û���Ҫ��ʵ�ʶ���
			Animal an =null;
			try
			{
				an = CreateAnimalFactory.getFactory(name);
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(null!=an)
			{
				an.eat();
			}
			
			
		}
		
		
	}

}
