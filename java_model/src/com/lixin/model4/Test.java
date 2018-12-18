package com.lixin.model4;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("请问用户喜欢什么样的动物?");
			
			Scanner  s =  new Scanner(System.in);
			
			String  name=s.next();
			
			//工厂类根据用户的需求来配置用户需要的实际对象
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
